fun main() {
    // Исходный массив чисел
    val numbers = arrayOf(15, 3, 22, 8, 42, 7, 19, 5, 31, 12)

    // Массивы для четных и нечетных чисел
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    // Разделяем числа на четные и нечетные
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }

    // Выводим результаты
    println("Четные числа: ${evenNumbers.joinToString(", ")}")
    println("Нечетные числа: ${oddNumbers.joinToString(", ")}")
}
