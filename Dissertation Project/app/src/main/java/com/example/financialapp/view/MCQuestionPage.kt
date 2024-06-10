package com.example.financialapp.view

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.financialapp.R
import com.example.financialapp.databinding.ActivityMcquestionPageBinding
import com.example.financialapp.models.Question
import com.example.financialapp.questions.multiplechoice.*

class MCQuestionPage : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMcquestionPageBinding
    private lateinit var finder: Question

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedAnswer: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mSubjectName: String = ""

    private var submit = false
    private var selectAnswer = true

    companion object private val totalQuestionSize = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        binding = ActivityMcquestionPageBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val extras = intent.extras
        mQuestionList = null
        val value = extras?.getInt("key")
        val title = extras?.getString("subjectName")

        binding.tvQuestionTitle.text = title

        when (value) {
            0 -> {
                mQuestionList = MCBenefits.getQuestion()
            }
            1 -> {
                mQuestionList = MCEverdayMoney.getQuestion()
            }
            2 -> {
                mQuestionList = MCFamilyCare.getQuestion()
            }
            3 -> {
                mQuestionList = MCHomes.getQuestion()
            }
            4 -> {
                mQuestionList = MCMoneyProblems.getQuestion()
            }
            5 -> {
                mQuestionList = MCPensionsRetirement.getQuestion()
            }
            6 -> {
                mQuestionList = MCSavings.getQuestion()
            }
            7 -> {
                mQuestionList = MCWork.getQuestion()
            }
        }

        var randomArray: ArrayList<Question> = ArrayList()
        while (mQuestionList!!.size != 0) {
            var random = (0 until ((mQuestionList!!.size))).random()
            randomArray.add(mQuestionList!![random])
            if(randomArray.size == totalQuestionSize) {
                break
            } else {
                mQuestionList!!.removeAt(random)
            }
        }
        mQuestionList = randomArray
        mSubjectName = extras?.getString("subjectName").toString()
        binding.pbProgress.max = mQuestionList!!.size
        setQuestion()

        binding.tvAnswer1.setOnClickListener(this)
        binding.tvAnswer2.setOnClickListener(this)
        binding.tvAnswer3.setOnClickListener(this)
        binding.tvAnswer4.setOnClickListener(this)
        binding.btnSubmitButton.setOnClickListener(this)
    }


    private fun defaultAnswers() {
        val options = ArrayList<TextView>()
        options.add(0, binding.tvAnswer1)
        options.add(1, binding.tvAnswer2)
        options.add(2, binding.tvAnswer3)
        options.add(3, binding.tvAnswer4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#0A1045"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.question_answers)
        }
    }

    override fun onClick(v: View?) {
        if (selectAnswer) {
            when (v?.id) {
                R.id.tv_answer1 -> {
                    selectedAnswer(binding.tvAnswer1, 1)
                    submit = true
                }
                R.id.tv_answer2 -> {
                    selectedAnswer(binding.tvAnswer2, 2)
                    submit = true
                }
                R.id.tv_answer3 -> {
                    selectedAnswer(binding.tvAnswer3, 3)
                    submit = true
                }
                R.id.tv_answer4 -> {
                    selectedAnswer(binding.tvAnswer4, 4)
                    submit = true
                }
            }
        }
        if (submit) {
            when (v?.id) {
                R.id.btn_submit_button -> {
                    if (!selectAnswer) {
                        mCurrentPosition++
                        when {
                            mCurrentPosition <= mQuestionList!!.size -> {
                                setQuestion()
                            }
                            else -> {
                                val intent = Intent(this, QuizResult::class.java)
                                intent.putExtra("subjectName", mSubjectName)
                                intent.putExtra("correctAnswers", mCorrectAnswers)
                                intent.putExtra("totalQuestions", mQuestionList!!.size)
                                intent.putExtra("multipleChoice", true)
                                startActivity(intent)
                                finish()
                            }
                        }
                    } else {
                        val option = mQuestionList?.get(mCurrentPosition - 1)
                        if (option!!.correctAnswer != mSelectedAnswer) {
                            answerResult(mSelectedAnswer, R.drawable.question_wrong_answer)
                            answerResult(option.correctAnswer, R.drawable.question_correct_answer)
                        } else {
                            mCorrectAnswers++
                            answerResult(option.correctAnswer, R.drawable.question_correct_answer)
                        }

                        if (mCurrentPosition == mQuestionList!!.size) {
                            binding.btnSubmitButton.text = "Results!"
                        } else {
                            binding.btnSubmitButton.text = "Next Question"
                        }
                        selectAnswer = false
                        mSelectedAnswer = 0
                    }
                }
            }
        }
    }

    private fun answerResult(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                binding.tvAnswer1.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.tvAnswer2.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.tvAnswer3.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.tvAnswer4.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedAnswer(tv: TextView, selectedAnswer: Int) {
        defaultAnswers()
        mSelectedAnswer = selectedAnswer
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.question_answers_highlighted)
    }

    private fun setQuestion() {
        submit = false
        selectAnswer = true
        finder = mQuestionList!![mCurrentPosition - 1]
        binding.pbProgress.progress = mCurrentPosition
        defaultAnswers()

        if (mCurrentPosition == mQuestionList!!.size) {
            binding.btnSubmitButton.text = "Submit"
        } else {
            binding.btnSubmitButton.text = "Submit"
        }

        binding.tvQuestionString.text = finder.question
        binding.tvAnswer1.text = finder.optionOne
        binding.tvAnswer2.text = finder.optionTwo
        binding.tvAnswer3.text = finder.optionThree
        binding.tvAnswer4.text = finder.optionFour
    }
}