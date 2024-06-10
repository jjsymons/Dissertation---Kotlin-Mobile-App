package com.example.financialapp.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.financialapp.databinding.ActivityInformationPageBinding
import com.example.financialapp.Info
import com.example.financialapp.models.InformationSheet

class InformationPage : AppCompatActivity() {

    private lateinit var binding: ActivityInformationPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        binding = ActivityInformationPageBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        // Get values passed to the example page
        val extras = intent.extras

        // If extras were passed and not null
        if (extras != null) {
            val value = extras.getInt("information")
            val subjectName = extras.getString("subjectName")
            val bool = extras.getBoolean("choice")
            val articleList = Info.getInformation()
            val finder: InformationSheet = articleList[value]

            binding.tvTitle.text = finder.title
            binding.tvPara1.text = finder.paraOne
            binding.tvPara2.text = finder.paraTwo

            if(bool){
                val button = binding.btnQuestionClick
                button.setOnClickListener {
                    val intent = Intent(this, MCQuestionPage::class.java)
                    intent.putExtra("key", value)
                    intent.putExtra("subjectName", subjectName)
                    startActivity(intent)
                    finish()
                    }

            } else {
                val button = binding.btnQuestionClick
                button.setOnClickListener {
                    val intent = Intent(this, FBQuestionPage::class.java)
                    intent.putExtra("key", value)
                    intent.putExtra("subjectName", subjectName)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}