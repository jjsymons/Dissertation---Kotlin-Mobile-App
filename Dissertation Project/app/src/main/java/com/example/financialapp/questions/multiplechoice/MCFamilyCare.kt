package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCFamilyCare {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            MCEverdayMoney.randomQuestion(
                "£4,383",
                "£5,362",
                "£4,810",
                "£4,756",
                "£4,383"
            )


        val q1 = Question(
            1,
            "On average, the cost for a burial is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            MCEverdayMoney.correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            MCEverdayMoney.randomQuestion(
                "£3,290",
                "£3,034",
                "£3,533",
                "£3,981",
                "£3,290"
            )

        val q2 = Question(
            2,
            "What is the average cost of a cremation...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            MCEverdayMoney.correctOptionNum!!
        )
        questionList.add(q2)

        randomArray = randomQuestion(
            "Take care of the funeral bill",
            "Take care of the Will",
            "Contact friends and family about the death of the person",
            "Take control of their finances",
            "Take care of the funeral bill")

        val q3 = Question(
            3,
            "The executor of the estate is tasked with...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q3)

        randomArray = randomQuestion(
            "The person who has died",
            "The local council",
            "Friends and Family",
            "Charitable organisations",
            "The person who has died")

        val q4 = Question(
            4,
            "Sometimes the funeral cost has been covered by:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q3)

        randomArray = randomQuestion(
            "A low-cost online service",
            "One or two advice sessions with a solicitor, but deal with the forms and paperwork yourself",
            "A mediator – an impartial person",
            "The original marriage registrar",
            "The original marriage registrar")

        questionList.add(q4)

        val q5 = Question(
            5,
            "Which of these is not a a possible way to find help with divorce",
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
                }
            }
        }
        return randomArray
    }



}