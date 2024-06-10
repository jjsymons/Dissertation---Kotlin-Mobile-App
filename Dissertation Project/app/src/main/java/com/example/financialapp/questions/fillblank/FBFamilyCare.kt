package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBFamilyCare {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "On average, the cost of a burial is between £4,383 and £3,290 for a", "", "cremation")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "Sometimes the funeral has already been paid for by the person who has", "", "died")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "Potentially money has been left in the person's", "to pay for the funeral", "estate")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "If money has been put aside in the estate of the person who has passed away then the", "will take care of paying for the funeral", "executor")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "In a divorce you can use a", "also known as an impartial person, to help you", "mediator")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "You can arrange one or two advice sessions with a", "but deal with the forms and paperwork yourself", "solicitor")

        fbQuestionList.add(q6)

        val q7 = FBQuestion(7, "You can arrange everything by yourself but can also use a low-cost", "service", "online")

        fbQuestionList.add(q7)

        return fbQuestionList
    }
}