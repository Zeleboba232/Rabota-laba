fun main() {
    // Создаем массив
    val array = arrayOf(1, 2, 3, 4, 5)

    // Инициализируем переменные для суммы и произведения
    var sum = 0
    var product = 1

    // Проходим по элементам массива
    for (element in array) {
        sum += element         // Находим сумму
        product *= element     // Находим произведение
    }

    // Выводим результаты
    println("Сумма элементов массива: $sum")
    println("Произведение элементов массива: $product")
}
