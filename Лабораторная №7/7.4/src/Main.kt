import kotlin.random.Random

data class Card(val rank: String, val suit: String) {
    fun value(): Int {
        return when (rank) {
            "2", "3", "4", "5", "6", "7", "8", "9", "10" -> rank.toInt()
            "J", "Q", "K" -> 10
            "A" -> 11 // Значение туза будет обработано позже
            else -> 0
        }
    }
}

class Deck {
    private val cards = mutableListOf<Card>()

    init {
        val suits = listOf("Hearts", "Diamonds", "Clubs", "Spades")
        val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")
        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
        shuffle()
    }

    private fun shuffle() {
        cards.shuffle()
    }

    fun drawCard(): Card {
        return if (cards.isNotEmpty()) cards.removeAt(0) else throw Exception("No cards left in the deck")
    }
}

class Player(val name: String) {
    private val hand = mutableListOf<Card>()

    fun addCard(card: Card) {
        hand.add(card)
    }

    fun calculateScore(): Int {
        var score = hand.sumOf { it.value() }
        var aces = hand.count { it.rank == "A" }

        while (score > 21 && aces > 0) {
            score -= 10
            aces--
        }
        return score
    }

    fun showHand() {
        println("$name's hand: ${hand.joinToString(", ") { "${it.rank} of ${it.suit}" }} (Score: ${calculateScore()})")
    }

    fun clearHand() {
        hand.clear()
    }
}

fun main() {
    val deck = Deck()
    val player = Player("Player")
    val dealer = Player("Dealer")

    // Раздача карт
    player.addCard(deck.drawCard())
    dealer.addCard(deck.drawCard())
    player.addCard(deck.drawCard())
    dealer.addCard(deck.drawCard())

    // Игровой процесс
    while (true) {
        player.showHand()
        dealer.showHand()

        if (player.calculateScore() > 21) {
            println("Player busts! Dealer wins!")
            return
        }

        println("Do you want to hit or stand? (h/s)")
        when (readLine()) {
            "h" -> player.addCard(deck.drawCard())
            "s" -> break
            else -> println("Invalid input. Please enter 'h' or 's'.")
        }
    }

    // Ход дилера
    while (dealer.calculateScore() < 17) {
        dealer.addCard(deck.drawCard())
    }

    // Итоги игры
    player.showHand()
    dealer.showHand()

    val playerScore = player.calculateScore()
    val dealerScore = dealer.calculateScore()

    when {
        dealerScore > 21 -> println("Dealer busts! Player wins!")
        playerScore > dealerScore -> println("Player wins!")
        dealerScore > playerScore -> println("Dealer wins!")
        else -> println("It's a tie!")
    }
}
