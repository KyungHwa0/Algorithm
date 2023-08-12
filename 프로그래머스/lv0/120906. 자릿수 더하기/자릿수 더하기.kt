class Solution {
    // fun solution(n: Int): Int {
    //     var num = n
    //     var sum = 0

    //     while (num > 0) {
    //         sum += num % 10
    //         num /= 10       
    //     }
    //     return sum
    // }

    // 다른사람풀이
    fun solution(n: Int): Int {
        var answer: Int = 0
        var temp = n.toString()
        for(i in temp){
            answer += i.toString().toInt()
        }
        return answer
    }
}
