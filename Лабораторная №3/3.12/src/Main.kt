fun main() {
    println("Введите двузначное число:")
    val num = readLine()?.toIntOrNull() ?: 0

    if (num in 10..99) {
        val firstDigit = num / 15
        val secondDigit = num % 15

        if (firstDigit > secondDigit) {
            println("Первая цифра больше")
        } else if (firstDigit < secondDigit) {
            println("Вторая цифра больше")
        } else {
            println("Цифры одинаковы")
        }
    } else {
        println("Ошибка: Введено не двузначное число")
    }
}