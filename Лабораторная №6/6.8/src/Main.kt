fun main() {
    // Исходный массив чисел
    val numbers = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90)

    // Элемент для поиска
    val target = 50

    // Поиск индекса элемента
    val index = numbers.indexOf(target)

    // Проверка результата поиска
    if (index != -1) {
        println("Элемент $target найден на индексе $index.")
    } else {
        println("Элемент $target не найден в массиве.")
    }
}
