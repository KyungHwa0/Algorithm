// class Solution {
//     fun solution(n: Int): Int {
//         return n / 7 + if (n % 7 > 0) 1 else 0
//     }
// }

// 다른사람 코드 1
//Math.ceil 함수를 사용하면 올림연산을 사용할수 있다.
// import kotlin.math.ceil

// class Solution {
//     fun solution(n: Int) = ceil(n / 7.0)
// }

// 다른사람 코드 2
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer=(n+6)/7
        return answer
    }
}
