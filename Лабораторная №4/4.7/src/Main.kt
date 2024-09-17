fun main() {
    print("Введите строку: ")
    val input = readLine() ?: return

    val length = input.length

    val lengthType = when {
        length < 15 -> "короткой"
        length in 15..25 -> "средней"
        else -> "длинной"
    }

    println("Введённая строка является $lengthType.")
}