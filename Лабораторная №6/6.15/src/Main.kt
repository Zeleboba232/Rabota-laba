fun main() {
    // Пример массива
    val array = arrayOf(1, 2, 3, 2, 1)

    // Проверяем, является ли массив палиндромом
    if (isPalindrome(array)) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}

// Функция для проверки, является ли массив палиндромом
fun <T> isPalindrome(array: Array<T>): Boolean {
    val n = array.size
    for (i in 0 until n / 2) {
        if (array[i] != array[n - 1 - i]) {
            return false
        }
    }
    return true
}
