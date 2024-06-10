package com.example.financialapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.financialapp.databinding.ActivityChoicePageBinding

class ChoicePage : AppCompatActivity() {
    private lateinit var binding: ActivityChoicePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChoicePageBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        supportActionBar?.hide()

        val extras = intent.extras
        val value = extras?.getInt("information")
        val subjectName = extras?.getString("subjectName")

        val optionMultipleChoice = binding.tvMultipleChoice

        optionMultipleChoice.setOnClickListener{
            val intent = Intent(this, InformationPage::class.java)
            intent.putExtra("information", value)
            intent.putExtra("subjectName", subjectName)
            intent.putExtra("choice", true)
            startActivity(intent)
            finish()
        }

        val optionFillInTheBlank = binding.tvFillInTheBlank
        optionFillInTheBlank.setOnClickListener{
            val intent = Intent(this, InformationPage::class.java)
            intent.putExtra("information", value)
            intent.putExtra("subjectName", subjectName)
            intent.putExtra("choice", false)
            startActivity(intent)

        }
    }
}