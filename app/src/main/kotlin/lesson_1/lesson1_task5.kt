package org.example.app.lesson_1

fun main() {

    const val secondInMinute = 60
    const val secondInHour = 3600
    val seconds = 6480
    var secondToTime = seconds % secondInMinute
    var minutes: Int = (seconds / secondInMinute) % secondInMinute
    var hours: Int = seconds / secondInHour

    println(String.format("%02d:%02d:%02d", hours, minutes, secondToTime))
}