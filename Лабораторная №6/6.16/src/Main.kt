fun main() {
    // Создаем два массива
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)

    // Конкатенируем массивы
    val concatenatedArray = array1 + array2

    // Выводим результат
    println("Конкатенированный массив: ${concatenatedArray.joinToString(", ")}")
}
