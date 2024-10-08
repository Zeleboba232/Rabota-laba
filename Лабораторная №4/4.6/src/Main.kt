import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 110)
    var guess: Int

    println("Угадайте число от 1 до 110")

    while (true) {
        print("Введите ваше предположение: ")
        guess = readLine()!!.toInt()

        when {
            guess < secretNumber -> println("Загаданное число больше.")
            guess > secretNumber -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляем! Вы угадали число $secretNumber.")
                break
            }
        }
    }
}