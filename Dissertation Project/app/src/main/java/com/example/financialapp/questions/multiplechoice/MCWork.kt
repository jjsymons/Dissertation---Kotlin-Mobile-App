package com.example.financialapp.questions.multiplechoice

import com.example.financialapp.models.Question

object MCWork {
    var correctOptionNum: Int? = null

    fun getQuestion(): ArrayList<Question>? {
        val questionList = ArrayList<Question>()

        var randomArray =
            randomQuestion(
                "The pay you receive over a day",
                "The pay you receive over a year",
                "The pay you receive over an hour",
                "The pay you receive over a week",
                "The pay you receive over an hour"
            )


        val q1 = Question(
            1,
            "The hourly rate is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )

        questionList.add(q1)

        randomArray =
            randomQuestion(
                "The amount of money you would earn in one year",
                "The amount of money you would earn per unit produced",
                "Often paid in addition to a salary or hourly rate",
                "The amount of money you would earn in one day",
                "The amount of money you would earn in one year"
            )

        val q2 = Question(
            2,
            "A salary is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q2)

        randomArray =
            randomQuestion(
                "The amount of money you would earn in one year",
                "The amount of money you would earn per unit produced",
                "Often paid in addition to a salary or hourly rate",
                "The amount of money you would earn in one day",
                "The amount of money you would earn in one year"
            )

        val q3 = Question(
            3,
            "Piece Work is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q3)

        randomArray =
            randomQuestion(
                "The amount of money you would earn in one year",
                "Often paid in addition to a salary or hourly rate",
                "The amount of money you would earn in one month",
                "The amount of money you would earn in one day",
                "Often paid in addition to a salary or hourly rate"
            )

        val q4 = Question(
            4,
            "A commission is...?",
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3],
            correctOptionNum!!
        )
        questionList.add(q4)

        randomArray =
            randomQuestion(
                "Choose your own hours work around other commitments",
                "Have more control over your income",
                "Dealing with an irregular income",
                "Can be rewarding",
                "Dealing with an irregular income"
            )

        val q5 = Question(
            5,
            "What is not a benefit of being self-employed?",
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
