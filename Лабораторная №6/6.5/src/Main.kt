fun main() {
    // Исходный массив с дублирующимися элементами
    val numbers = arrayOf(15, 3, 22, 8, 42, 7, 15, 3, 19, 5, 31, 12, 8)

    // Используем множество для хранения уникальных элементов
    val uniqueNumbers = numbers.toSet()

    // Выводим уникальные элементы
    println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")
}
