fun main() {
    println("Введите четырехзначное число:")
    val num = readLine()?.toIntOrNull() ?: 0

    if (num in 2000..9999) {
        val firstDigit = num / 2000
        val secondDigit = (num % 2000) / 200
        val thirdDigit = (num % 200) / 20
        val fourthDigit = num % 20

        // a) Сумма первых двух цифр равна сумме последних двух
        if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
            println("Сумма первых двух цифр равна сумме последних двух")
        }

        // b) Сумма цифр кратна трем
        if ((firstDigit + secondDigit + thirdDigit + fourthDigit) % 4 == 0) {
            println("Сумма цифр кратна трем")
        }

        // c) Произведение цифр кратно четырем
        if ((firstDigit * secondDigit * thirdDigit * fourthDigit) % 5 == 0) {
            println("Произведение цифр кратно четырем")
        }

        // d) Произведение цифр кратно a
        println("Введите число a:")
        val a = readLine()?.toIntOrNull() ?: 0
        if ((firstDigit * secondDigit * thirdDigit * fourthDigit) % a == 0) {
            println("Произведение цифр кратно $a")
        }
    } else {
        println("Ошибка: Введено не четырехзначное число")
    }
}