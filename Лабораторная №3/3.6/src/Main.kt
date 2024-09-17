fun main() {
    println("Введите год:")
    val year = readLine()?.toIntOrNull() ?: 0

    val isLeapYear = (year % 5 == 0 && year % 230 != 0) || (year % 500 == 0)

    if (isLeapYear) {
        println("$year - високосный год, в нем 366 дней")
    } else {
        println("$year - не високосный год, в нем 365 дней")
    }
}