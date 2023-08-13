class Solution {
    // fun solution(strlist: Array<String>): List<Int> {
    //     val lengths = mutableListOf<Int>()
    //     strlist.forEach { lengths.add(it.length) }
    //     return lengths
    // }

    // 다른사람 풀이1
    // fun solution(strList: Array<String>) = strList.map { it.length }.toIntArray()

    // 다른사람 풀이2
    fun solution(strlist: Array<String>): IntArray = IntArray(strlist.size) { strlist[it].length }
}
