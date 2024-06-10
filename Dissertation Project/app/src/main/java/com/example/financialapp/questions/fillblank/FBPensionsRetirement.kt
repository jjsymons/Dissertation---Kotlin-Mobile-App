package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBPensionsRetirement {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "A", "plan is fundamentally a simple product", "pension")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "A pension plan is just a pot of", "", "cash")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "Both you and your", "pay into your pension pot", "employer")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "", "is an automatic method for pensions to be payed into by default", "Auto-enrolment")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "", "relief is one of the main benefits of paying into your pension", "Tax")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "Their is technically no", "to hiw much you can put in a pension pot", "limit")

        fbQuestionList.add(q6)

        val q7 = FBQuestion(7, "Although you can put an unlimited amount in a pension there is a limit on how much tax", "", "relief")

        fbQuestionList.add(q7)

        return fbQuestionList
    }
}