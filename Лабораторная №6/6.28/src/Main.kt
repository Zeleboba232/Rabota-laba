fun main() {
    // Запрос ввода от пользователя
    println("Введите числа через пробел:")

    // Чтение строки ввода
    val input = readLine()

    // Проверка на null и разделение строки на массив строк
    val array = input?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toTypedArray()

    // Проверка на пустой массив
    if (array.isNullOrEmpty()) {
        println("Вы ввели пустой массив или некорректные данные.")
    } else {
        // Вывод массива
        println("Вы ввели массив: ${array.joinToString(", ")}")
    }
}
