fun main() {
    val array = arrayOf(1, 1, 2, 2, 2, 3, 3, 1, 1) // Исходный массив

    val maxSequence = findMaxSequence(array)

    println("Максимальная последовательность одинаковых элементов: $maxSequence")
}

// Функция для нахождения максимальной последовательности одинаковых элементов
fun findMaxSequence(array: Array<Int>): Pair<Int, Int> {
    if (array.isEmpty()) return Pair(0, 0) // Проверка на пустой массив

    var maxCount = 1
    var currentCount = 1
    var maxElement = array[0]

    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentCount++ // Увеличиваем счетчик текущей последовательности
        } else {
            // Проверяем, является ли текущая последовательность максимальной
            if (currentCount > maxCount) {
                maxCount = currentCount
                maxElement = array[i - 1]
            }
            currentCount = 1 // Сбрасываем счетчик для новой последовательности
        }
    }

    // Проверяем последнюю последовательность
    if (currentCount > maxCount) {
        maxCount = currentCount
        maxElement = array[array.size - 1]
    }

    return Pair(maxElement, maxCount) // Возвращаем элемент и количество
}
