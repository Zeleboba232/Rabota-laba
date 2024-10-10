fun countCharacters(text: String): Int {
    return text.length
}

fun main() {
    val text = "Привет, мир!"
    val characterCount = countCharacters(text)
    println("Количество символов в строке '$text': $characterCount")
}