class Solution {
    fun solution(strlist: Array<String>): List<Int> {
        val lengths = mutableListOf<Int>()
        strlist.forEach { lengths.add(it.length) }
        return lengths
    }
}