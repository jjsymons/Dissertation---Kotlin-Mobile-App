package com.example.financialapp.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.print.PrintAttributes
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.MarginLayoutParamsCompat
import androidx.core.view.marginBottom
import androidx.core.view.marginTop
import com.example.financialapp.R
import com.example.financialapp.databinding.ActivityFbquestionPageBinding
import com.example.financialapp.models.FBQuestion
import com.example.financialapp.models.Question
import com.example.financialapp.questions.fillblank.*

class FBQuestionPage : AppCompatActivity() {
    private lateinit var binding: ActivityFbquestionPageBinding
    private lateinit var finder: FBQuestion

    private var fbCurrentPosition: Int = 1
    private var fbQuestionList: ArrayList<FBQuestion>? = null
    private var fbCorrectAnswers: Int = 0
    private var fbSubjectName: String = ""
    private var fbAnswer: String? = null
    private val totalQuestionSize = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityFbquestionPageBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val extras = intent.extras
        val value = extras?.getInt("key")
        val title = extras?.getString("subjectName")

        fbQuestionList = null
        fbSubjectName = title!!
        binding.tvTitle.text = fbSubjectName

        when (value) {
            0 -> {
                fbQuestionList = FBBenefits.getFBQuestion()
            }
            1 -> {
                fbQuestionList = FBEverydayMoney.getFBQuestion()
            }
            2 -> {
                fbQuestionList = FBFamilyCare.getFBQuestion()
            }
            3 -> {
                fbQuestionList = FBHomes.getFBQuestion()
            }
            4 -> {
                fbQuestionList = FBMoneyProblems.getFBQuestion()
            }
            5 -> {
                fbQuestionList = FBPensionsRetirement.getFBQuestion()
            }
            6 -> {
                fbQuestionList = FBSavings.getFBQuestion()
            }
            7 -> {
                fbQuestionList = FBWork.getFBQuestion()
            }
        }
        val randomArray: ArrayList<FBQuestion> = ArrayList()
        while (fbQuestionList!!.size != 0) {
            val random = (0 until ((fbQuestionList!!.size))).random()
            if (randomArray.size == totalQuestionSize) {
                break
            } else {
                randomArray.add(fbQuestionList!![random])
                fbQuestionList!!.removeAt(random)
            }
        }
        fbQuestionList = randomArray
        binding.pbProgress.max = fbQuestionList!!.size

        setQuestion()

        val textInput = binding.teInput

        binding.btnSubmit.setOnClickListener {
            if (binding.teInput.text.toString().isNotEmpty()) {
                answerChecker()
                textInput.text?.clear()
            } else {
                textInput.hint = "Please provide an answer"
            }
        }
    }

    private fun answerChecker() {
        val answer = binding.teInput.text.toString().trim()
        if (answer.uppercase() == fbAnswer?.uppercase()) {
            fbCorrectAnswers++
            binding.tvFeedback.setTextColor(Color.parseColor("#64dd17"))
            binding.tvFeedback.text = "Correct, well done!"

        } else {
            binding.tvFeedback.setTextColor(Color.parseColor("#c30000"))
            binding.tvFeedback.text =
                "Incorrect, the answer was: ${finder.answer.replaceFirstChar { finder.answer[0].uppercase() }}"
        }

        if (fbCurrentPosition <= fbQuestionList!!.size) {
            fbCurrentPosition++
            setQuestion()
        }
    }

    private fun setQuestion() {
        binding.teInput.hint = ""
        binding.pbProgress.progress = fbCurrentPosition
        if (fbCurrentPosition > fbQuestionList!!.size) {
            binding.tvFirstSentence.visibility = View.GONE
            binding.tvSecondSentence.visibility = View.GONE
            binding.pbProgress.visibility = View.GONE
            binding.teInput.visibility = View.GONE
            binding.btnSubmit.text = "Results"
            binding.btnSubmit.setOnClickListener {
                Toast.makeText(this, "Calculating Final Results", Toast.LENGTH_SHORT).show()
                Handler(Looper.getMainLooper()).postDelayed({
                    sendIntent()
                }, 1000)
            }
        } else {

            finder = fbQuestionList!![fbCurrentPosition - 1]

            if (fbCurrentPosition == fbQuestionList!!.size) {
                binding.btnSubmit.text = "Submit"
            } else {
                binding.btnSubmit.text = "Submit"
            }
            if (finder.firstString == "") {
                binding.tvFirstSentence.visibility = View.GONE
            } else {
                binding.tvFirstSentence.visibility = View.VISIBLE
                binding.tvFirstSentence.text = "\"" + finder.firstString + "..."
            }
            if (finder.secondString == "") {
                binding.tvSecondSentence.visibility = View.GONE
            } else {
                binding.tvSecondSentence.visibility = View.VISIBLE
                binding.tvSecondSentence.text = "..." + finder.secondString + "\""
            }
            fbAnswer = finder.answer
        }
    }

    private fun sendIntent() {
        val intent = Intent(this, QuizResult::class.java)
        intent.putExtra("subjectName", fbSubjectName)
        intent.putExtra("correctAnswers", fbCorrectAnswers)
        intent.putExtra("totalQuestions", fbQuestionList!!.size)
        intent.putExtra("multipleChoice", false)
        startActivity(intent)
        finish()
    }
}