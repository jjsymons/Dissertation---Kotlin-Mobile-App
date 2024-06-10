package com.example.financialapp.questions.fillblank

import com.example.financialapp.models.FBQuestion

object FBHomes {
    fun getFBQuestion(): ArrayList<FBQuestion>? {

        val fbQuestionList = ArrayList<FBQuestion>()

        val q1 = FBQuestion(1, "The most important thing about\nrenting is can I", "it", "afford")

        fbQuestionList.add(q1)

        val q2 = FBQuestion(2, "You should ask how many weeks", "you need to put down for a deposit", "rent")

        fbQuestionList.add(q2)

        val q3 = FBQuestion(3, "Are there future fees such as exit\nfees or ", "fees", "renewal")

        fbQuestionList.add(q3)

        val q4 = FBQuestion(4, "A","Calculator can help you work\nout what you can afford to buy","mortgage")

        fbQuestionList.add(q4)

        val q5 = FBQuestion(5, "","deposits will make your \nmortgage cheaper","large")

        fbQuestionList.add(q5)
        val q6 = FBQuestion(6, "You should make sure your","scores do not have any errors","credit")

        fbQuestionList.add(q6)
        val q7 = FBQuestion(7, "When selling you should\nget your property","","valued")

        fbQuestionList.add(q7)

        val q8 = FBQuestion(8, "An","agent can value your property","estate")

        fbQuestionList.add(q8)

        val q9 = FBQuestion(9, "","fees and other costs should\nbe considered when renting","tenancy")

        fbQuestionList.add(q9)

        return fbQuestionList
    }
}