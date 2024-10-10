fun findIndexOf(arr: IntArray, element: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == element) {
            return i
        }
    }

    return -1
}