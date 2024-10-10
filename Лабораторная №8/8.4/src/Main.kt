fun willYouWin(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    val prob = 0.2  // Вероятность выигрыша
    val prize = 50.0 // Размер приза
    val pay = 10.0   // Ставка

    val result = willYouWin(prob, prize, pay)
    println("Решение: $result")
}