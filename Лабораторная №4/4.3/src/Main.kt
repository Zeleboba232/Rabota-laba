fun main() {
    print("Введите числовое значение: ")
    val score = readLine()!!.toInt()

    val grade = when {
        score in 91..100 -> "Отлично"
        score in 80..90 -> "Хорошо"
        score in 69..79 -> "Удовлетворительно"
        score in 45..68 -> "Допустимо"
        score in 0..39 -> "Неудовлетворительно"
        else -> {
            println("Некорректное значение. Введите число от 0 до 100.")
        }
    }

    println("Оценка: $grade")
}