package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCPensionsRetirement {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "It is just a pot of cash that you, and your employer, can pay into",
                "It is a plan where you choose what you'll do once retired",
                "It is a decision of how you'll make money after you retire",
                "It is a pre-retirement list of items to do before you die",
                "It is just a pot of cash that you, and your employer, can pay into"
            )


        val q1 = Question(
            1,
            "What is a pension plan?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "Tax relief",
                "Better life experience",
                "Improved mental health",
                "Increased taxation",
                "All these examples are dumb"
            )

        val q2 = Question(
            2,
            "A key benefit of a pension plan is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "Minimum contributions to your pension",
                "Tax relief",
                "Higher salaries",
                "None of the other options",
                "Minimum contributions to your pension"
            )

        val q3 = Question(
            3,
            "Auto-enrollment enables...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "There is no limit",
                "£1,073,10",
                "£40,000",
                "20,000",
                "There is no limit"
            )

        val q4 = Question(
            4,
            "The maximum contribution to your pension pot is:?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "50% of your earnings",
                "29% of your earnings",
                "64% of your earnings",
                "100% of your earnings",
                "100% of your earnings"
            )

        val q5 = Question(
            5,
            "What is the limit on money you can put into your pension based on your Earnings Limit?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q5)

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
                    //println("correctOption: $s at ${index + 1}")
                }
                //println(s)
            }
        }
        return randomArray
    }



}
