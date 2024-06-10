package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBWork {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "An", "rate is the amount of money you receive every hour you work", "hourly")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "The amount of money based on what is produced is called", "work", "piece")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "For piece work the more you produce the more you are", "", "paid")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "Piece can also be paid by", "", "commission")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "Although rewarding, working for yourself can be hard, such as dealing with an irregular", "", "income")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "", "is often paid in addition to a salary or an hourly rate", "Commission")

        fbQuestionList.add(q6)

        val q7 = FBQuestion(7, "As a self employed person you have more control of the", "you decide to work as well as your income", "hours")

        fbQuestionList.add(q7)

        return fbQuestionList
    }
}