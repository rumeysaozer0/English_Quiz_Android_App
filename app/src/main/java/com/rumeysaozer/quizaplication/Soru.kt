package com.rumeysaozer.quizaplication

data class Soru (
    val id: Int,
    val question: String,
    val word: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int

)