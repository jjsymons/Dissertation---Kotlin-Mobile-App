package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBSavings {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "", "calculators are useful as they can help you work out how much you can afford to save", "Saving")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "You should always try save", "", "regularly")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "The benefit of saving is that you can put all your money in one place and then earn", "", "interest")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "Investing gives a chance of losing some or all of your money, but it'll", "more quickly", "grow")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "Investing carries some", "", "risks")

        fbQuestionList.add(q5)

        val q6 = FBQuestion(6, "If you are looking to save for something in particular, you may prefer just to", "than invest", "save")

        fbQuestionList.add(q6)

        return fbQuestionList
    }
}