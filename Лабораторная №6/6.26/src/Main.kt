fun main() {
    val array = arrayOf(1, 2, 3, 4, 5) // Исходный массив

    val average = calculateAverage(array)

    println("Среднее арифметическое: $average")
}

// Функция для вычисления среднего арифметического
fun calculateAverage(array: Array<Int>): Double {
    if (array.isEmpty()) return 0.0 // Проверка на пустой массив

    val sum = array.sum() // Сумма всех элементов
    return sum.toDouble() / array.size // Вычисление среднего
}
