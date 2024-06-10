package com.example.financialapp

import com.example.financialapp.models.InformationSheet
import kotlinx.coroutines.Job

object Info {
    fun getInformation(): ArrayList<InformationSheet> {
        val information = ArrayList<InformationSheet>()

        val e1 = InformationSheet(
            1, "Benefits", "Universal Credit is a payment to help with your living costs. It’s paid monthly - or twice a month for some people in Scotland."+

        "\n\nYou may be able to get it if you’re on a low income, out of work or you cannot work, if they have a disability, are bringing up children, are retired, care for someone or are ill.\n\n"+

        "\n\nIn general you are entitled to benefits if:"+
        "\n\tYou’re on a low income or out of work"+
        "\n\tYou’re 18 or over (there are some exceptions if you’re 16 to 17)"+
        "\n\tYou’re under State Pension age (or your partner is)"+
        "\n\tYou and your partner have £16,000 or less in savings between you"+
        "\n\tYou live in the UK",

        "You can also use a benefits calculator to work out the value of your entitlement."+

        "\n\nNew Style Job Seeker Allowance:"+

        "\n\nTo be eligible you will need to have:"+
        "\nWorked as an employee"+
        "\nPaid Class 1 National Insurance contributions, usually in the last 2 to 3 years (National Insurance credits can also count)"+

        "\n\nYou'll also need to have:\n\n"+
        "\n\tBe 18 or over (there are some exceptions if you’re 16 or 17 - contact Jobcentre Plus for advice)"+
        "\n\tBe under the State Pension age"+
        "\n\tNot be in full-time education"+
        "\n\tBe available for work"+
        "\n\tNot be working at the moment, or be working less than 16 hours per week on average"+
        "\n\tNot have an illness or disability which stops you from working"+
        "\n\tLive in England, Scotland or Wales"
        )

        information.add(e1)

        val e2 = InformationSheet(
            2,
            "Everyday Money",
            "Budgeting:\n" +
                    "One of the best things to do is use a budget calculator to work out your costs.\n\n" +
                    "If you seem unable to afford the costs, lay out all the costs on paper and see what you can cut out.",
            "Banking:\n\n" +
                    "Managing a bank account is one of the things many people overlook when it comes to their money.\n" +
                    "\n" +
                    "Most people use a current account with a bank or building society to manage their day-to-day money.\n" +
                    "\n" +
                    "It allows you to:\n" +
                    "\n" +
                    "pay bills by Direct Debit or standing order\n\t" +
                    "receive automated payments, such as salary, wages or benefits\n\t" +
                    "have an overdraft, although the bank will \n\t\t\tneed to authorise this\n\t" +
                    "pay for things with a debit card and withdraw \t\t\tmoney from cashpoint machines.\n\n" +
                    "To help you manage your money, you can:\n\n" +
                    "Use the secure bank app, to check and make payments\n" +
                    "Set up text alerts, to warn you of a low balance."
        )

        information.add(e2)

        val e3 = InformationSheet(
            3,
            "Family & Care",
            "On average, the cost for a burial is £4,383 and £3,290 for a cremation. There are lots of things to think about and decide when arranging a funeral."+
                    "\nSometimes, the person who’s died has already paid for their funeral. Or they’ve left some money in their estate to cover it."+
                    "If so, the executor of the estate will take care of paying the funeral bill."+
                    "\nOtherwise, usually a relative or friend pays for the funeral."+
                    "\nBut they can get the funeral costs back from the estate if there’s enough in it.",

        "Divorce"+"\nWhen working out how much help you need, there are several options:"+
                "\nYou can arrange everything on your own or use a low-cost, online service."+
                "\nYou can arrange for one or two advice sessions with a solicitor, but deal with the forms and paperwork yourself."+
                "\nYou can use a mediator – an impartial person – to help you and your ex-partner (husband, wife or civil partner) reach an agreement."
        )

        information.add(e3)
        val e4 = InformationSheet(
            4,
            "Homes",
            "There are a few things that everyone should know about buying, renting or selling a property.\n\nRenting:\n\nCan you afford the property.\n" +
                    "how many weeks rent is required for a deposit?\n What are the tenancy fees?\nAre there any other costs?\nAre there any other costs to be expected further into the tenancy (exit fees/renewal fees)?",
            "Buying:\n\nConsider using a mortgage calculator to work out what you can afford\nA larger deposit will make your future mortgage payments much cheaper\nCheck your credit scores for any errors and try to improve them.\n\n" +
                    "Selling:\n\nGet your property valued, get it valued by a good estate agent\nDon't always ask for the highest price, this can lead to being unable to sell the property for a long time.\n"
        )

        information.add(e4)
        val e5 = InformationSheet(
            5,
            "Money Problems",
            "If you think your gambling is a problem, it’s important to be honest and talk about it. If you don’t, your situation is likely to get worse."+

        "\n\nIf you think you might have a problem, some warning signs are if you’re:"+

        "using your overdraft, other forms of credit or borrowing from family or friends to pay for gambling"+
        "missing payments to debts or priority bills because you’ve spent the money on gambling"+
        "gambling to try and win money to pay off your debts.",


            "Add up how much you owe\n The first step towards taking control is to put together a list of everyone you need to make payments to"+
        "\nincluding household bills\nmortgage or rent payments outstanding loan\nor credit payments and debt repayments."+

            "\n\nSome bills and payments are higher priority as the consequences of not paying can be more serious."+
                    "\n\nIt’s important to get free debt advice as soon as you can if you’ve fallen behind on priority payments, or are facing any emergency issues, including:"+
            "\nbeing contacted by bailiffs \nreceiving a court summons\nhaving your gas or electricity cut off\nhaving your home, car or goods repossessed"
            )

        information.add(e5)
        val e6 = InformationSheet(
            6,
            "Pensions and Retirement",
            "A pension plan is fundamentally a simple product:"+
                    "\nIt is just a pot of cash that you, and your employer, can pay into - and which you get tax relief on - as a way of saving up for your retirement."+
                    "\nA key plus of a pension plan is the tax relief, which comes in two forms depending on whether you're a basic-rate or higher-rate taxpayer.",

            "With auto-enrolment workplace pensions, there are minimum contribution levels. But if you can afford it, you really should be contributing more."+
                "\n\nThere's technically no limit as to how much you can put in a pension - but there are limits on how much tax relief you'll get for doing so."+
                "\nAn Earnings Limit - You get tax relief on contributions up to your annual earnings."+
                "\nAnnual Limit - £40,000"+
                "\nA Lifetime Limit - £1,073,10"+
                "\n\nFrom 6 April 2019, the minimum employer contribution level increased to 3%. Under auto enrolment, total contributions must be at least 8% so if the employer only puts in 3%, the employee has to contribute 5%."
        )

        information.add(e6)
        val e7 = InformationSheet(
            7,
            "Savings",
            "There are lots of things to think about if you're planning to save."+
                    "Is it better to save or invest and what type of account should you choose?"+
                    "\n\nA savings calculator can help you:"+
                    "\nWork out how long it’ll take to save for something, if you know how much you can save regularly."+
                    "\nOr if you need something by a certain date, can tell you how much you need to save regularly."+
                    "\nHow to keep your savings on track by giving you some helpful tips.",
                            "It's important to understand the difference between saving and investing as a start point."+
                            "Saving – You put money away in complete safety, and get it all back plus interest."+
                                    "Investing – You risk losing some of your cash for the chance it'll grow quicker."
        )

        information.add(e7)
        val e8 = InformationSheet(
            8,
            "Work",
            "How will my pay be worked out?\nSalary\n\nThe amount of money you would earn in one year. \n\nHourly rate\nYou earn a set amount for every hour you work.\n\nPiece work\nThe more units you produce, the more you’ll be paid.\n\nCommission"+
                    "\nYou receive a share of the sales you make. Commission is often paid in addition to a salary or hourly rate.",

        "Self-employed? Whether you’re new to working for yourself or have been doing it for years, we’ve got guides that will answer your questions."+
                "\n\nWorking for yourself can be very rewarding. It means you can:\n\ndo something that interests you, or that you’re passionate about"+

        "\nchoose your own hours work around other commitments, such as your children"+
        "\nhave more control over your income."+
        "\n\nBut there are also some downsides, including:"+

        "\nworking long hours and at weekends"+
                "\ndealing with an irregular income"+
                "\nhaving to do your own bookkeeping and tax return"+
                "\nlimited or no access to employment benefits, such as paid leave."
        )

        information.add(e8)
        return information
    }
}