package org.example.app.lesson_1

fun main() {
    val seconds = 6480
    var secondToTime = seconds % 60
    var minutes: Int = (seconds / 60) % 60
    var hours: Int = seconds / 3600

    println(String.format("%02d:%02d:%02d", hours, minutes, secondToTime))
}