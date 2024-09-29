fun main() {
    // Запрос ввода от пользователя
    println("Введите числа через пробел:")

    // Чтение строки ввода
    val input = readLine()

    // Проверка на null и разделение строки на массив чисел
    val array = input?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toTypedArray()

    // Проверка на пустой массив
    if (array.isNullOrEmpty()) {
        println("Вы ввели пустой массив или некорректные данные.")
    } else {
        // Нахождение медианы
        val median = findMedian(array)
        println("Медиана массива: $median")
    }
}

// Функция для нахождения медианы
fun findMedian(array: Array<Int>): Double {
    // Сортировка массива
    val sortedArray = array.sorted()

    // Нахождение длины массива
    val size = sortedArray.size

    return if (size % 2 == 1) {
        // Если количество элементов нечетное, медиана — средний элемент
        sortedArray[size / 2].toDouble()
    } else {
        // Если количество элементов четное, медиана — среднее двух средних элементов
        (sortedArray[size / 2 - 1] + sortedArray[size / 2]) / 2.0
    }
}

