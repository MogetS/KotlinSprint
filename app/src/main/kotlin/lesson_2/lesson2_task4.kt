package org.example.app.lesson_2


    const val percent = 100
    const val buffPercent = 20
fun main(){
    val crystalOre = 7
    val ironOre = 11
    val buffCrystalOre = (crystalOre/percent.toDouble())*buffPercent // считаем сколько дополнительной кристалической руды добудут под баффом
    val buffIronOre = (ironOre/percent.toDouble())*buffPercent       // считаем сколько дополнительной железной руды добудут под баффом

    println("Количество кристалической руды добытой без бафа: $crystalOre")
    println("Количество железной руды добытой без бафа: $ironOre")
    println("Количество кристалической руды добытой бонусом от действия 20% баффа: ${buffCrystalOre.toInt()}")
    println("Количество железной руды добытой бонусом от действия 20% баффа: ${buffIronOre.toInt()}")
}