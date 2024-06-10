package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCEverdayMoney {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "Work out your costs monthly",
                "Do maths questions",
                "Work out how much you can save",
                "Apply for jobs",
                "Work out your costs monthly"
            )


        val q1 = Question(
            1,
            "You can use a budget Calculator to...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "Take loans",
                "Get a credit score",
                "Receive deliveries",
                "Pay bills with Direct Debits",
                ""
            )

        val q2 = Question(
            2,
            "What's one possible use of a current account lets you?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "Your balance is low",
                "You can take a loan",
                "You are about to receive money",
                "You owe money",
                "Your balance is low"
            )

        val q3 = Question(
            3,
            "Most banks use text alerts which can let you know that:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "Automated payments, such as a salary",
                "Lottery winnings",
                "Mail",
                "Job offers",
                "Automated payments, such as a salary"
            )

        val q4 = Question(
            4,
            "A Bank account lets you receive:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "Bank account",
                "Cash",
                "A good relationship with the bank",
                "A job",
                "Bank account"
            )

        val q5 = Question(
            5,
            "You will need one of these to withdraw money from an ATM:",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q5)

        randomArray =
            randomQuestion(
                "Pay bills by direct debit or standing order",
                "receive automated payments, such as salary",
                "pay for things with a debit card",
                "Respect in the local community",
                "Respect in the local community"
            )

        val q6 = Question(
            6,
            "Which of these is NOT a benefit of a bank account?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q6)

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







