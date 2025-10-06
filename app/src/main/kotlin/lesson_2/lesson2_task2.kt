package org.example.app.lesson_2


fun main() {
    val employee = 50                                                   // сотрудник
    val employeeSalary = 30000                                          // зарплата сотрудника
    val juniorEmployee = 30                                             // стажёр
    val juniorEmployeeSalary = 20000                                    // зарплата стажёра

    val expenseEmployee = employee * employeeSalary                      // расходы на сотрудников
    val expenseJuniorEmployee = juniorEmployee * juniorEmployeeSalary    // расходы на стажёров

    val totalExpense = expenseEmployee + expenseJuniorEmployee           // общие расходы по ЗП вместе со стажёрами
    val averageSalary =totalExpense / (employee + juniorEmployee)        // средняя зарплата сотрудников вместе со стажёрами

    println("Расходы на выплату постоянных сотрудников: $expenseEmployee рублей.")
    println("Общие расходы по ЗП после прихода стажёров: $totalExpense рублей.")
    println("Средняя зарплата сотрудника после устройства стажёров: $averageSalary рублей.")
}
