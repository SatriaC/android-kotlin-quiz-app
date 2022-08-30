package com.fromzerotohero.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_argentina,
            "Japan",
            "Argentina",
            "Australia",
            "Austria",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_australia,
            "Thailand",
            "Argentina",
            "Australia",
            "Austria",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_belgium,
            "Belgium",
            "Argentina",
            "Australia",
            "Austria",
            1
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_brazil,
            "Belgium",
            "Argentina",
            "Brazil",
            "Uruguay",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_denmark,
            "Belgium",
            "Portugal",
            "Denmark",
            "Normegia",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_fiji,
            "Australia",
            "Malaysia",
            "Fiji",
            "Amerika Serikat",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_germany,
            "Jerman",
            "Italia",
            "Perancis",
            "Luxemburg",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_india,
            "Turki",
            "India",
            "Rusia",
            "Ukraina",
            2
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_kuwait,
            "Palestina",
            "Irak",
            "Iran",
            "Kuwait",
            4
        )
        questionList.add(que9)

        return questionList
    }
}