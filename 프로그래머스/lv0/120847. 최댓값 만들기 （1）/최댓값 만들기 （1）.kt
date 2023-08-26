class Solution {
    fun solution(numbers: IntArray): Int {
        // 내림차순으로 정렬
        // sortedDescending() 주어진 컬렉션(리스트나 배열 등)의 원소들을 내림차순으로 정렬한 새로운 리스트를 반환하는 함수
        val sortNumbers = numbers.sortedDescending()
        
        // 첫번째, 두번째 두 수를 곱한다
        return sortNumbers[0] * sortNumbers[1]
    }
}
