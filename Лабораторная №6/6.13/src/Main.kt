import kotlin.random.Random

fun main() {
    // Создаем массив из 20 случайных чисел
    val array = IntArray(20) { Random.nextInt(1, 101) }

    // Выводим массив на экран
    println("Случайный массив: ${array.joinToString(", ")}")
}
