fun main() {
    // Исходный массив
    val array = arrayOf(1, 2, 3, 4, 5)

    // Индексы элементов, которые нужно поменять местами
    val index1 = 1 // Элемент со значением 2
    val index2 = 3 // Элемент со значением 4

    // Меняем местами элементы
    swap(array, index1, index2)

    // Вывод результата
    println("Массив после перестановки: ${array.joinToString(", ")}")
}

// Функция для обмена местами двух элементов в массиве
fun swap(arr: Array<Int>, index1: Int, index2: Int) {
    if (index1 in arr.indices && index2 in arr.indices) {
        val temp = arr[index1]
        arr[index1] = arr[index2]
        arr[index2] = temp
    } else {
        println("Индексы выходят за пределы массива.")
    }
}
