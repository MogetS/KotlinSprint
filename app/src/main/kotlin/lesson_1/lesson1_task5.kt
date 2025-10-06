package org.example.app.lesson_1

const val SECOND_IN_MINUTE = 60
const val SECOND_IN_HOUR = 3600
fun main() {


    val seconds = 6480
    var secondToTime = seconds % SECOND_IN_MINUTE
    var minutes: Int = (seconds / SECOND_IN_MINUTE) % SECOND_IN_MINUTE
    var hours: Int = seconds / SECOND_IN_HOUR


    println(String.format("%02d:%02d:%02d", hours, minutes, secondToTime))
}