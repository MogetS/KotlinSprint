package org.example.app.lesson_2


const val minuteInHour = 60
fun main() {
    val departureTimeHour = 9                            // количество часов отправления с сервера
    val departureTimeMin = 39                            // количество минут отправления с сервера


    val departureTime = departureTimeHour * minuteInHour + departureTimeMin // время отпрвления с сервера в минутах
    val travelTime = 457                                 // время в пути в минутах
    val arrivalTime = departureTime + travelTime  // время прибытия в минутах

    var minutes: Int = (arrivalTime / minuteInHour) % minuteInHour
    var hours: Int = arrivalTime / minuteInHour

    println("Время прибытия: " + String.format("%02d:%02d", hours, minutes))  // перобразовываем переменные  minutes, hours в  формат времени и выводим в консоль время прибытия

}


