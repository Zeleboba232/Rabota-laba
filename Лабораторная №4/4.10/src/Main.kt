fun main() {
    print("Введите способ оплаты (наличные, кредитная карта, PayPal): ")
    val payMet = readLine()?.trim()?.lowercase() ?: return

    val message = when (payMet) {
        "наличные" -> "Вы выбрали оплату наличными."
        "кредитная карта" -> "Вы выбрали оплату кредитной картой."
        "paypal" -> "Вы выбрали оплату через PayPal."
        else -> "Неизвестный способ оплаты."
    }

    println(message)
}