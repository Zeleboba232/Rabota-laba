fun main() {
    println("Введите слово:")
    val input = readLine() ?: ""

    if (isPalindrome(input)) {
        println("$input является палиндромом.")
    } else {
        println("$input не является палиндромом.")
    }
}

fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.replace("\\s".toRegex(), "").lowercase()
    return cleanedWord == cleanedWord.reversed()
}

