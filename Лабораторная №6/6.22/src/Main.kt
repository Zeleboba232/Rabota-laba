fun main() {
    val array = arrayOf(3, 1, 4, 4, 5, 2, 5)

    val secondMax = findSecondMax(array)

    if (secondMax != null) {
        println("Второй по величине элемент: $secondMax")
    } else {
        println("Нет второго по величине элемента.")
    }
}

fun findSecondMax(array: Array<Int>): Int? {
    // Используем множество для хранения уникальных значений
    val uniqueElements = array.toSet()

    // Если меньше двух уникальных элементов, возвращаем null
    if (uniqueElements.size < 2) {
        return null
    }

    // Сортируем уникальные элементы и получаем второй максимальный
    val sortedUniqueElements = uniqueElements.sortedDescending()
    return sortedUniqueElements[1]
}
