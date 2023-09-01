class Solution {
    // fun solution(rsp: String): String {
    //     var answer: String = ""
    //     for (r in rsp) {
    //         when (r) {
    //             // 가위는 바위에 짐, 바위 추가
    //             '2' -> answer += '0'
    //             // 바위는 보에 짐, 보 추가
    //             '0' -> answer += '5'
    //             // 보는 가위에 짐, 가위 추가
    //             '5' -> answer += '2'
    //         }
    //     }
    //     return answer
    // }

    // 다른사람풀이
    fun solution(rsp: String): String  = rsp.map{ 
        when(it){
            '2' -> '0'
            '0' -> '5'
            else -> '2'
        }
    }.joinToString("")
}
