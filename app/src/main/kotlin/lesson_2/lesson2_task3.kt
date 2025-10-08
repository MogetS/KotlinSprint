package org.example.app.lesson_2


const val MINUTE_IN_HOUR = 60
fun main() {
    val departureTimeHour = 9                            // количество часов отправления с сервера
    val departureTimeMin = 39                            // количество минут отправления с сервера


    val departureTime = departureTimeHour * MINUTE_IN_HOUR + departureTimeMin // время отпрвления с сервера в минутах
    val travelTime = 457                                 // время в пути в минутах
    val arrivalTime = departureTime + travelTime  // время прибытия в минутах

    var minutes: Int = (arrivalTime / MINUTE_IN_HOUR) % MINUTE_IN_HOUR
    var hours: Int = arrivalTime / MINUTE_IN_HOUR

    println("Время прибытия: " + String.format("%02d:%02d", hours, minutes))  // перобразовываем переменные  minutes, hours в  формат времени и выводим в консоль время прибытия

}


