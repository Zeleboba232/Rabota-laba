fun main() {
    // Исходные массивы
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf(4, 5, 6, 7, 8)

    // Находим пересечение массивов
    val intersection = array1.intersect(array2.toSet())

    // Вывод результата
    println("Пересечение массивов: $intersection")
}
