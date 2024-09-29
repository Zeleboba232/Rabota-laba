fun main() {
    // Создаем массив
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    // Размер группы
    val groupSize = 5

    // Проходим по массиву с шагом groupSize
    for (i in array.indices step groupSize) {
        // Получаем подмассив с текущей группой
        val group = array.copyOfRange(i, minOf(i + groupSize, array.size))
        // Выводим группу
        println("Группа: ${group.joinToString(", ")}")
    }
}
