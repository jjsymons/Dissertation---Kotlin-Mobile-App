package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBMoneyProblems {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "It's important to be", "about a gambling problem", "honest")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "Using your overdraft and other forms of credit can indicate you have a", "problem", "gambling")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "One indicator of a gambling problem is when you", "money from friends and family to pay for your bets", "borrow")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "", "payments on rent, mortgages, loans or similar prioritise is an indicator that you may have a gambling problem", "Missing")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "When acknowledging your gambling problem, add up how much you", "to your creditors", "owe")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "When you begin paying back your debts, some bills should take higher ", "", "priorities")

        fbQuestionList.add(q6)

        val q7 = FBQuestion(6, "You can use a", "advice service", "free")

        fbQuestionList.add(q7)

        return fbQuestionList
    }
}