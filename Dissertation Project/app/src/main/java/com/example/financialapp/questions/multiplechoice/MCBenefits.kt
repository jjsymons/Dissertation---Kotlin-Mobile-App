package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCBenefits {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "You're on a low income",
                "You're using a benefits calculator",
                "You contact your local MP",
                "You are a immigrant",
                "You're on a low income"
            )

        val q1 = Question(
            1,
            "In general you are entitled to Universal Credit if:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "Apply for benefits",
                "Get a passport",
                "Work out the value of your entitlement",
                "Work out your budget",
                "Work out the value of your entitlement"
            )

        val q2 = Question(
            2,
            "A benefits calculator can help you:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "£16,000",
                "£14,000",
                "£18,000",
                "£20,000",
                "£16,000"
            )

        val q3 = Question(
            3,
            "You can are entitled to benefits if you have less than this much in savings between you and a partner",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "Be 18 or over",
                "Be 25 or over",
                "Be 16 or over",
                "Be 21 or over",
                "Be 18 or over"
            )

        val q4 = Question(
            4,
            "To qualify for the New Style Job Seeker Allowance you must:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "England, Scotland and Wales",
                "England, Scotland and Northern Ireland",
                "England, Wales and Northern Ireland",
                "Scotland, Wales and Northern Ireland",
                "England, Scotland and Wales"
            )

        val q5 = Question(
            5,
            "You must live in any of the three following countries:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q5)

        randomArray =
            randomQuestion(
                "Jobcentre Plus",
                "Department for Work and Pensions",
                "Your local County Council",
                "Your local community centre",
                "Jobcentre Plus"
            )

        val q6 = Question(
            6,
            "There are some exceptions for who can qualify for New Style Job Seeker Allowance, you can contact one of the following organisations to find out if you qualify:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q6)

        randomArray =
            randomQuestion(
                "You are a Veteran",
                "You have any disability",
                "You have been in Prison",
                "You have an illness or disability which stops you working",
                "You have an illness or disability which stops you working"
            )

        val q7 = Question(
            7,
            "You are also not eligible for New Style Job Seeker Allowance if:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q7)

        randomArray =
            randomQuestion(
                "Under State Pension Age",
                "Over 21",
                "Have a dependent",
                "Be in a Marriage/Civil Partnership",
                ""
            )

        val q8 = Question(
            8,
            "To be eligible for New Style Job Seeker and Universal Credit you must be",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q8)

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