package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCMoneyProblems {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "Honest",
                "Deceitful",
                "Generous",
                "Forthcoming",
                "Honest"
            )


        val q1 = Question(
            1,
            "If you believe your gabling to be a problem, it's good to be...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "You spend more time with your family",
                "You gamble to try and recover your losses",
                "You stop taking calls",
                "You invest money",
                "You gamble to try and recover your losses"
            )

        val q2 = Question(
            2,
            "What are some warning signs that could indicate a gambling problem?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "Borrowing money from friends or family for gambling",
                "Missing payments to debts or priority bills because of money spent on gambling",
                "Gambling to try and win money to pay off your debts",
                "You fall out with your partner",
                "You fall out with your partner"
            )

        val q3 = Question(
            3,
            "Which of the following is not an indicator of a gambling problem?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "Write a list of the money you owe",
                "Bet more to recover your debts",
                "Ask your friends for money to pay others back",
                "Call your bookie",
                "Write a list of the money you owe"
            )

        val q4 = Question(
            4,
            "The first step of taking back control of your gambling addiction?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "Having your gas or electricity cut off",
                "Having your home, car or goods repossessed",
                "Being contacted by bailiffs",
                "Being asked to leave venues",
                "Being asked to leave venues"
            )

        val q5 = Question(
            5,
            "Which is not a potential consequence of being in debt?",
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
