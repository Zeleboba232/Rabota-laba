fun main() {
    // Создаем массив из 10 целых чисел
    val numbers = arrayOf(15, 3, 22, 8, 42, 7, 19, 5, 31, 12)

    // Выводим исходный массив
    println("Исходный массив: ${numbers.joinToString(", ")}")

    // Сортировка пузырьком
    for (i in numbers.indices) {
        for (j in 0 until numbers.size - 1 - i) {
            if (numbers[j] > numbers[j + 1]) {
                // Меняем местами элементы
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }

    // Выводим отсортированный массив
    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}
