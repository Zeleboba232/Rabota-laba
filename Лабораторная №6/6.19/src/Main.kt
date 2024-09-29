fun main() {
    // Два отсортированных массива
    val array1 = arrayOf(1, 3, 5, 7, 9)
    val array2 = arrayOf(2, 4, 6, 8, 10)

    // Слияние массивов
    val mergedArray = mergeSortedArrays(array1, array2)

    // Вывод результата
    println("Слитый отсортированный массив: ${mergedArray.joinToString(", ")}")
}

fun mergeSortedArrays(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    val merged = mutableListOf<Int>()
    var i = 0
    var j = 0

    // Слияние двух массивов
    while (i < array1.size && j < array2.size) {
        if (array1[i] <= array2[j]) {
            merged.add(array1[i])
            i++
        } else {
            merged.add(array2[j])
            j++
        }
    }

    // Добавляем оставшиеся элементы из первого массива
    while (i < array1.size) {
        merged.add(array1[i])
        i++
    }

    // Добавляем оставшиеся элементы из второго массива
    while (j < array2.size) {
        merged.add(array2[j])
        j++
    }

    return merged.toTypedArray()
}
