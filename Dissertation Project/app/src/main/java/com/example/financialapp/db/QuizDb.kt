package com.example.financialapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.financialapp.models.QuizResult

@Database(
    entities = [QuizResult::class],
    version = 6
)

abstract class QuizDb : RoomDatabase() {

    abstract fun getDao(): QuizDao

    companion object {

        @Volatile
        private var instance: QuizDb? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDb(context).also {
                instance = it
            }
        }

        private fun createDb(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            QuizDb::class.java,
            "quiz_db.db"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
    }

}