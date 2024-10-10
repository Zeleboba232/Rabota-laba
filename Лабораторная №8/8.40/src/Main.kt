fun copyArray(array: IntArray): IntArray {
    val copy = IntArray(array.size)
    for (i in array.indices) {
        copy[i] = array[i]
    }
    return copy
}