class Solution {
    fun solution(numbers: IntArray): String {
        val comparator = Comparator<String> { a, b -> (b + a).compareTo(a + b) }
        val sortedNumbers = numbers.map { it.toString() }.sortedWith(comparator)
        return if (sortedNumbers[0] == "0") "0" else sortedNumbers.joinToString("")
    }
}


// class Solution {
//     fun solution(numbers: IntArray): String {
//         var answer = ""        
//         numbers.sortedWith(Comparator({num1: Int, num2: Int -> "$num2$num1".compareTo("$num1$num2")})).forEach { answer += it }
//         if ("(0*)".toRegex().replace(answer, "").isEmpty()) {
//             answer = "0"
//         }
//         return answer
//     }
// }
