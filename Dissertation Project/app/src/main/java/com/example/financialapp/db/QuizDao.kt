package com.example.financialapp.db

import androidx.room.*
import com.example.financialapp.models.QuizResult

@Dao
interface QuizDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrUpdate(quizResult: QuizResult)

    @Query("Select * From results")
    fun getAllResults(): List<QuizResult>


}