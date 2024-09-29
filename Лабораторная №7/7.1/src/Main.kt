import java.util.Scanner

fun main() {
    val scanner = Scanner(System.in)

    while (true) {
        println("Консольный калькулятор")
        println("Введите первое число (или 'exit' для выхода):")

        val input = scanner.nextLine()
        if (input.lowercase() == "exit") {
            println("Выход из программы.")
            break
        }

        val firstNumber = input.toDoubleOrNull()
        if (firstNumber == null) {
            println("Ошибка: введите корректное число.")
            continue
        }

        println("Введите оператор (+, -, *, /):")
        val operator = scanner.nextLine()

        println("Введите второе число:")
        val secondInput = scanner.nextLine()
        val secondNumber = secondInput.toDoubleOrNull()
        if (secondNumber == null) {
            println("Ошибка: введите корректное число.")
            continue
        }

        val result = when (operator) {
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> {
                if (secondNumber != 0.0) {
                    firstNumber / secondNumber
                } else {
                    println("Ошибка: деление на ноль!")
                    continue
                }
            }
            else -> {
                println("Ошибка: неверный оператор!")
                continue
            }
        }

        println("Результат: $result")
    }
}
