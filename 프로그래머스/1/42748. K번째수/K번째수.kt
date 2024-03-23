class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            val i = command[0] - 1
            val j = command[1]
            val k = command[2] - 1

            val subArray = array.sliceArray(i until j).sorted()
            subArray[k]
        }.toIntArray()
    }
}

fun main() {
    val solution = Solution()
    val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val commands = arrayOf(
        intArrayOf(2, 5, 3),
        intArrayOf(4, 4, 1),
        intArrayOf(1, 7, 3)
    )

    val answer = solution.solution(array, commands)
    println(answer.joinToString(", "))
}