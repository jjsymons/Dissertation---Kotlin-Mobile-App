package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBEverydayMoney {
    fun getFBQuestion(): ArrayList<FBQuestion>? {
        val fbQuestionList = ArrayList<FBQuestion>()
        val q1 = FBQuestion(1, "You can use a", "Calculator to work out your costs", "Budget")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "If you are struggling to budget you can lay out your costs on", "to see what you can cut", "paper")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "Managing a", "account is one of the things most people overlook", "bank")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "A Bank Account allows you to, among other things pay", "", "bills")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "", "Debit or standing orders are some of the ways people can pay their bills", "Direct")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "Most banks have mobile apps that can be used to manage your", "", "money")

        fbQuestionList.add(q6)

        val q7 = FBQuestion(7, "You can set up", "alerts to warn you of a low balance", "text")

        fbQuestionList.add(q7)

        return fbQuestionList
    }
}