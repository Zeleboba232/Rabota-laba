fun countVowels(str: String): Int {
    var count = 0
    val vowels = "aeiouAEIOU"

    for (c in str) {
        if (vowels.contains(c)) {
            count++
        }
    }

    return count
}