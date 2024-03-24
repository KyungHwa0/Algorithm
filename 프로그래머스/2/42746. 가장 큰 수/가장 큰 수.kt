class Solution {
    fun solution(numbers: IntArray): String {
        val comparator = Comparator<String> { a, b -> (b + a).compareTo(a + b) }
        val sortedNumbers = numbers.map { it.toString() }.sortedWith(comparator)
        return if (sortedNumbers[0] == "0") "0" else sortedNumbers.joinToString("")
    }
}