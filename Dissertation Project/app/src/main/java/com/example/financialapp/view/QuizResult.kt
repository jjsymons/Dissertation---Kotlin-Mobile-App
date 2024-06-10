package com.example.financialapp.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.financialapp.databinding.ActivityQuizResultBinding
import com.example.financialapp.db.QuizDb
import com.example.financialapp.models.QuizResult
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.SimpleDateFormat
import java.util.*

class QuizResult : AppCompatActivity() {
    private lateinit var binding: ActivityQuizResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizResultBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val dao = QuizDb.invoke(applicationContext).getDao()

        supportActionBar?.hide()

        val values = intent.extras

        val correct = values?.getInt("correctAnswers")
        val totalQuestions = values?.getInt("totalQuestions")
        val subjectName = values?.getString("subjectName")
        val multipleChoice = values?.getBoolean("multipleChoice")

        val typeOfTest: String?
        val cT = SimpleDateFormat("yyyy/MM/dd/hh:mm:ss")
        val dT = SimpleDateFormat("dd/MM/yy")

        val displayTime = dT.format(Date())
        val compareDate = cT.format(Date())
        var id = 0
        if (multipleChoice == true) {
            typeOfTest = "Multiple Choice"
            when (subjectName) {
                "Benefits" -> {
                    id = 0
                }
                "Everyday Money" -> {
                    id = 1
                }
                "Family & Care" -> {
                    id = 2
                }
                "Homes" -> {
                    id = 3
                }
                "Money Troubles" -> {
                    id = 4
                }
                "Pensions & Retirement" -> {
                    id = 5
                }
                "Savings" -> {
                    id = 6
                }
                "Work" -> {
                    id = 7
                }
            }
        } else {
            typeOfTest = "Fill in the Blank"
            when(subjectName){
                "Benefits" -> {
                    id = 8
                }
                "Everyday Money" -> {
                    id = 9
                }
                "Family & Care" -> {
                    id = 10
                }
                "Homes" -> {
                    id = 11
                }
                "Money Troubles" -> {
                    id = 12
                }
                "Pensions & Retirement" -> {
                    id = 13
                }
                "Savings" -> {
                    id = 14
                }
                "Work" -> {
                    id = 15
                }

            }
        }

        val quizResult = QuizResult(
            primaryId = id,
            subjectName = subjectName,
            correctQuestionNumber = correct,
            totalQuestionNumber = totalQuestions,
            checkTime = compareDate,
            typeOfTest = typeOfTest,
            displayTime = displayTime
        )

        dao.insertOrUpdate(quizResult)

        val home = binding.btnHome
        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        if (totalQuestions != null && correct != null) {
            binding.tvScoreView.text = "$correct / $totalQuestions"

            val percent = correct.toDouble() / totalQuestions.toDouble() * 100

            val decimal = BigDecimal(percent).setScale(2, RoundingMode.HALF_EVEN)

            binding.tvPercentageView.text = "$decimal%"

            when (percent.toInt()) {
                in 0..10 -> {
                    binding.tvFeedback.text = "Keep trying! You need to get some more stars!"
                    binding.pbRatingBar.setRating(0F)
                }
                in 11..20 -> {
                    binding.tvFeedback.text =
                        "A journey of a thousand miles begins with a single step!"
                    binding.pbRatingBar.setRating(0.5F)
                }
                in 21..30 -> {
                    binding.tvFeedback.text = "Let's go back over that material and go one better!"
                    binding.pbRatingBar.setRating(1F)
                }
                in 31..40 -> {
                    binding.tvFeedback.text = "You've got what it takes to excel at this!"
                    binding.pbRatingBar.setRating(1.5F)
                }
                in 41..49 -> {
                    binding.tvFeedback.text =
                        "The biggest room in a house is the room for improvement!"
                    binding.pbRatingBar.setRating(2F)
                }
                in 50..60 -> {
                    binding.tvFeedback.text = "You've got what it takes, try again!"
                    binding.pbRatingBar.setRating(2.5F)
                }
                in 61..70 -> {
                    binding.tvFeedback.text = "With some work you can ace this!"
                    binding.pbRatingBar.setRating(3F)
                }
                in 71..80 -> {
                    binding.tvFeedback.text = "Looks like you've got a good understanding"
                    binding.pbRatingBar.setRating(3.5F)
                }
                in 81..90 -> {
                    binding.tvFeedback.text = "Great effort today, can you go a star better!"
                    binding.pbRatingBar.setRating(4.0F)
                }
                in 91..99 -> {
                    binding.tvFeedback.text = "Almost perfect, give yourself a pat on the back!"
                    binding.pbRatingBar.setRating(4.5F)
                }
                100 -> {
                    binding.tvFeedback.text = "Wow, well done on getting 100%!"
                    binding.pbRatingBar.setRating(5F)
                }
            }
        }
    }
}