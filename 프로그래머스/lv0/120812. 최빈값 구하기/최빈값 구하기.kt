class Solution {
    fun solution(array: IntArray): Int {
        var count: Int = 0
        var answer: Int = 0
        var bool: Int = 0
        var arr = Array(2000){0}

        for(i:Int in 0..array.size-1) {
            arr[array[i]+1000]++
            if (arr[array[i]+1000] == count)
                bool++
            else if (arr[array[i]+1000] > count) {
                answer = array[i]
                count++
                bool = 0
            }
        }

        if (bool > 0)
            answer = -1
        return answer
    }
}