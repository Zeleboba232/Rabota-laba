fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 3, 6)
    val elementToRemove = 3

    val newArray = removeElement(array, elementToRemove)

    println("Исходный массив: ${array.joinToString(", ")}")
    println("Массив после удаления элемента $elementToRemove: ${newArray.joinToString(", ")}")
}

fun removeElement(array: Array<Int>, element: Int): Array<Int> {
    return array.filter { it != element }.toTypedArray()
}
