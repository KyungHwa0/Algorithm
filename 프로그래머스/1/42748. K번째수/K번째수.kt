class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            val slicedArray = array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()
            slicedArray[command[2] - 1]
        }.toIntArray()
    }
}