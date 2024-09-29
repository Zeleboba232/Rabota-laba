import kotlin.random.Random

fun main() {
    // Создаем массив из 20 случайных чисел от 1 до 100
    val array = IntArray(20) { Random.nextInt(1, 101) }

    // Выводим исходный массив
    println("Исходный массив: ${array.joinToString(", ")}")

    // Фильтруем и выводим числа, делящиеся на 3
    val divisibleByThree = array.filter { it % 3 == 0 }

    // Проверяем, есть ли такие числа и выводим их
    if (divisibleByThree.isNotEmpty()) {
        println("Числа, делящиеся на 3: ${divisibleByThree.joinToString(", ")}")
    } else {
        println("Нет чисел, делящихся на 3.")
    }
}
