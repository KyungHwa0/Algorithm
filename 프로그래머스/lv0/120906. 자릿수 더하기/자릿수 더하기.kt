class Solution {
    fun solution(n: Int): Int {
        var num = n
        var sum = 0

        while (num > 0) {
            sum += num % 10
            num /= 10       
        }
        return sum
    }
}