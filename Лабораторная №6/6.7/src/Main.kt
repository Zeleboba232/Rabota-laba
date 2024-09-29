fun main() {
    // Исходный массив чисел
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Реверсируем массив
    val reversedNumbers = numbers.reversedArray()

    // Выводим оригинальный и реверсированный массивы
    println("Оригинальный массив: ${numbers.joinToString(", ")}")
    println("Реверсированный массив: ${reversedNumbers.joinToString(", ")}")
}
