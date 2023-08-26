class Solution {
    fun solution(numbers: IntArray): Int {
        // 내림차순으로 정렬
        val sortNumbers = numbers.sortedDescending()
        
        // 첫번째, 두번째 두 수를 곱한다
        return sortNumbers[0] * sortNumbers[1]
    }
}