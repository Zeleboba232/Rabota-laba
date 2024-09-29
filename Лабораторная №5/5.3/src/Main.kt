fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        val sum = (1..n).sum()
        println("Сумма чисел от 1 до $n равна $sum")
    } else {
        println("Пожалуйста, введите корректное положительное число.")
    }
}
