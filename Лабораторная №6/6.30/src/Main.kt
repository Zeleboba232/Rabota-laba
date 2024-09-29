import kotlin.random.Random

fun main() {
    // Создание массива из 100 случайных целых чисел
    val numbers = IntArray(100) { Random.nextInt(1, 101) } // Числа от 1 до 100

    // Разделение массива на 10 групп по 10 элементов
    val groups = numbers.toList().chunked(10)

    // Вывод результатов
    for ((index, group) in groups.withIndex()) {
        println("Группа ${index + 1}: ${group.joinToString(", ")}")
    }
}
