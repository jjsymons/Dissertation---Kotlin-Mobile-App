package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCHomes {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "Afford the property",
                "Buy the property",
                "Have good room mates",
                "Have a mortgage",
                "Afford the property"
            )


        val q1 = Question(
            1,
            "Before renting, you should consider whether you can?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "Deposit",
                "Mortgage",
                "Car lease",
                "Solicitor",
                "Deposit"
            )

        val q2 = Question(
            2,
            "To be able to begin renting, you should find out how many weeks rent you need for a...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "Appliance costs",
                "Exit fees",
                "Subscription",
                "Renewal fees",
                "Exit fees"
            )

        val q3 = Question(
            3,
            "You should find out and future fees such as?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "The bank of Mum and Dad",
                "A budgeting app",
                "A mortgage calculator",
                "Advice from friends and family",
                "A mortgage calculator"
            )

        val q4 = Question(
            4,
            "To help work out the cost of buying a home you should try using...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "A mortgage",
                "A gaming computer",
                "A holiday abroad",
                "A friends wedding",
                "A mortgage"
            )

        val q5 = Question(
            5,
            "A larger deposit can help make what, more affordable?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q5)

        randomArray =
            randomQuestion(
                "Improve it",
                "Make it worse",
                "Tell the bank it's none of their business",
                "Pretend you don't have one",
                "Improve it"
            )

        val q6 = Question(
            6,
            "Credit Scores, are used to help a bank determine the risk of loaning to you, what should you try to do with a Credit Score?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q6)

        randomArray =
            randomQuestion(
                "Add an extension",
                "Get a surveyor to assess the property",
                "Get it valued",
                "Ask for an exemption in stamp duty",
                "Get it valued"
            )

        val q7 = Question(
            7,
            "When selling your property, what is the first thing you should do?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q7)

        randomArray =
            randomQuestion(
                "An estate agent",
                "A surveyor",
                "You can do it yourself",
                "A bank manager",
                "An estate agent"
            )

        val q8 = Question(
            8,
            "Who should value your property?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q8)

        randomArray =
            randomQuestion(
                "It can take longer to sell",
                "It makes other homes more expensive",
                "You will be investigated by Rightmove or Zoopla",
                "The local council will ask for the property price to be lowered",
                "It can take longer to sell"
            )

        val q9 = Question(
            9,
            "What can be detrimental of asking for too much money when setting your homes asking price?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q9)

        return questionList
    }

    fun randomQuestion(
        option1: String,
        option2: String,
        option3: String,
        option4: String,
        correctOption: String
    ): ArrayList<String> {
        val optionList = arrayListOf(option1, option2, option3, option4)
        var randomArray: ArrayList<String> = ArrayList()
        while (optionList.size != 0) {
            var random = (0 until ((optionList.size))).random()
            randomArray.add(optionList[random])
            optionList.removeAt(random)

            randomArray.forEachIndexed { index, s ->
                if (s == correctOption) {
                    correctOptionNum = index + 1
                }
            }
        }
        return randomArray
    }



}
