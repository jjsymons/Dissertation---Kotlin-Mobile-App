package com.example.financialapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "results")
data class QuizResult(
    @PrimaryKey(autoGenerate = true)
    val primaryId: Int? = null,
    val subjectName: String? = null,
    val correctQuestionNumber: Int? = null,
    val totalQuestionNumber: Int? = null,
    val checkTime: String? = null,
    val displayTime: String? = null,
    val typeOfTest: String
)
