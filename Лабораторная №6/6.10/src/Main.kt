fun main() {
    // Исходный массив
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Вычисление суммы четных чисел
    val sumOfEvens = numbers.filter { it % 2 == 0 }.sum()

    // Вывод результата
    println("Сумма четных чисел: $sumOfEvens")
}
