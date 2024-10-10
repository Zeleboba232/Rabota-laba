fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val number = 4 // Замените это значение на нужное вам
    val result = isEven(number)
    println("Число $number четное: $result")
}