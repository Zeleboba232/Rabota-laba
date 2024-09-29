fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val target = 3

    val found = linearSearch(array, target)

    if (found) {
        println("Элемент $target найден в массиве.")
    } else {
        println("Элемент $target не найден в массиве.")
    }
}

// Функция для линейного поиска
fun linearSearch(array: Array<Int>, target: Int): Boolean {
    for (element in array) {
        if (element == target) {
            return true // Элемент найден
        }
    }
    return false // Элемент не найден
}
