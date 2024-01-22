package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "which is the best IDE?",
            R.drawable.ic_ide,
            "Visual Studio", "Visual Studio Code",
            "Intellij IDEA", "Eclipse", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which programming language is this symbol?",
            R.drawable.ic_cs,
            "C", "PHP",
            "C#", "C++", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which programming language is this symbol?",
            R.drawable.ic_py,
            "Swift", "Kotlin",
            "PHP", "Python", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, " Who is the creator of Linux?",
            R.drawable.ic_linux,
            "Larry Page ", " Linus Torvalds",
            "Tim Berners-Lee", "James Gosling", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which programming language is this symbol?",
            R.drawable.ic_java,
            "Java", "C#",
            "C++", "C", 1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which programming language is this symbol?",
            R.drawable.ic_php,
            "Kotlin", "Java",
            "PHP", "C++", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the latest evolution of HTML?",
            R.drawable.ic_html,
            "HTML5", "HTML7",
            "XML", "HTML", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Which programming language is this symbol?",
            R.drawable.ic_kotlin,
            "Kotlin", "Java",
            "C++", "C", 1
        )

        questionsList.add(que8)

        return questionsList
    }
}
