package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCSavings {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "You put money away in complete safety, and get it all back plus interest",
                "You risk losing some of your cash for the chance it'll grow quicker",
                "You put money away in complete safety, and get paid in the returns of your investment",
                "You put money away in risky places, and get paid in the returns of your investment",
                "You put money away in complete safety, and get it all back plus interest"
            )


        val q1 = Question(
            1,
            "The definition of saving is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "You risk losing some of your cash for the chance it'll grow quicker",
                "You put money away in complete safety, and get it all back plus interest",
                "You risk losing some cash and will receive smaller returns",
                "You put your money away in risky places, and get paid in interest returns",
                "You risk losing some of your cash for the chance it'll grow quicker"
            )

        val q2 = Question(
            2,
            "The definition of investing is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "Work out the value of your investments",
                "Keep track of your steps each day",
                "Help you keep a track of your arrangements",
                "Work out how much you can afford to save",
                "Work out how much you can afford to save"
            )

        val q3 = Question(
            3,
            "A savings calculator can help you...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "How long it will take to save for your objective",
                "Interest rates",
                "Your broker costs",
                "Loan options",
                "How long it will take to save for your objective"
            )

        val q4 = Question(
            4,
            "Before saving or investing, you should consider?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "Is it better to save or invest and what type of account should you choose?",
                "Do you plan on marrying a partner?",
                "Should you consider changing jobs",
                "Would you be better off buying a lottery ticket",
                "You risk losing some of your cash for the chance it'll grow quicker"
            )

        val q5 = Question(
            5,
            "There are lots of things to think about if you're planning to save?",
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
