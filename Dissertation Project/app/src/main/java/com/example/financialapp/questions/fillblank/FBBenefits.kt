package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBBenefits {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "Universal", "is a payment to help with your living costs", "Credit")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "Universal Credit is paid unless you live outside the UK or in", "", "Scotland")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "", "calculator can help you work out the value of your entitlement", "benefits")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "To qualify for job seekers allowance you should not be", "at that point in time", "working")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "You must have less than 16,000 in savings between yourself and a partner to qualify for Universal", "", "Credit")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "You do not normally qualify for New Style Job Seekers Allowance if you are under 18 but you can check for some exceptions if you are 16-17 by contacting the", "Plus", "Jobcentre")

        fbQuestionList.add(q6)

        val q7 = FBQuestion(7, "You can get New Style Job Seekers Allowance if you live in England, Scotland or", "", "Wales")

        fbQuestionList.add(q7)

        return fbQuestionList
    }
}