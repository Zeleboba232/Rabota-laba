fun main() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5)
    val array3 = arrayOf(6, 7, 8, 9)

    val resultArray = mergeArrays(array1, array2, array3)

    println("Результирующий массив: ${resultArray.joinToString(", ")}")
}

fun mergeArrays(vararg arrays: Array<Int>): Array<Int> {
    // Создаем список для хранения объединенных элементов
    val mergedList = mutableListOf<Int>()

    // Проходим по каждому массиву и добавляем его элементы в список
    for (array in arrays) {
        mergedList.addAll(array)
    }

    // Преобразуем список обратно в массив и возвращаем
    return mergedList.toTypedArray()
}
