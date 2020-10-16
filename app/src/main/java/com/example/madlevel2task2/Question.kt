package com.example.madlevel2task2

data class Question( var questionText: String, var answer: Boolean ) {
    companion object {
        val QUESTION = arrayOf(
            "Mobile Application Development grants 12 ECTS.",
            "1 + 1 = 2",
            "2 + 2 = 4",
            "9 + 10 = 21",
            "De antwoord op deze vraag is false"
        )

        val ANSWER = arrayOf( true, true, true, false, false )
    }
}