fun main() {
    // Пример использования функции
    val wins = 10
    val draws = 5
    val losses = 2

    val points = calculatePoints(wins, draws, losses)
    println("Количество очков: $points")
}

fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    val pointsFromWins = wins * 3
    val pointsFromDraws = draws * 1
    val pointsFromLosses = losses * 0 // можно не учитывать, но для ясности оставим

    return pointsFromWins + pointsFromDraws + pointsFromLosses
}
