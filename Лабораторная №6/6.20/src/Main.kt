fun main() {
    // Параметры арифметической прогрессии
    val start = 5     // Начальное значение
    val step = 3      // Шаг прогрессии
    val count = 10    // Количество элементов

    // Создание массива арифметической прогрессии
    val arithmeticProgression = createArithmeticProgression(start, step, count)

    // Вывод результата
    println("Арифметическая прогрессия: ${arithmeticProgression.joinToString(", ")}")
}

fun createArithmeticProgression(start: Int, step: Int, count: Int): Array<Int> {
    return Array(count) { start + it * step }
}
