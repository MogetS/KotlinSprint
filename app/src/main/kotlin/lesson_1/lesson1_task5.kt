package org.example.app.lesson_1

fun main() {

    val secondInMinute = 60
    val seconds = 6480
    var secondToTime = seconds % secondInMinute
    var minutes: Int = (seconds / secondInMinute) % secondInMinute
    var hours: Int = seconds / 3600

    println(String.format("%02d:%02d:%02d", hours, minutes, secondToTime))
}