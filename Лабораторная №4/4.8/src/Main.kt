fun main() {
    print("Введите тип пищи (например, 'пицца', 'суп', 'омлет'): ")
    val foodType = readLine()?.trim()?.lowercase() ?: return

    val cookingTime = when (foodType) {
        "пицца" -> "30 минут"
        "суп" -> "4 минут"
        "омлет" -> "5 минут"
        "паста" -> "25 минут"
        "рис" -> "25 минут"
        else -> "Неизвестный тип пищи"
    }

    println("Время приготовления $foodType: $cookingTime")
}