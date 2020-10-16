package com.example.madlevel2task2

data class Question( var questionText: String, var answer: Boolean ) {
    companion object {
        val QUESTION_ANSWER = arrayOf(
            arrayOf("Mobile Application Development grants 12 ECTS.", true),
            arrayOf("1 + 1 = 2", true),
            arrayOf("2 + 2 = 4", true),
            arrayOf("9 + 10 = 21", false),
            arrayOf("De antwoord op deze vraag is false", false)
        )
    }
}