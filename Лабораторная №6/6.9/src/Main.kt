fun main() {
    // Исходный массив
    val originalArray = arrayOf(1, 2, 3, 4, 5)

    // Копирование массива
    val copiedArray = originalArray.copyOf()

    // Вывод оригинального и скопированного массивов
    println("Оригинальный массив: ${originalArray.joinToString(", ")}")
    println("Скопированный массив: ${copiedArray.joinToString(", ")}")
}
