class Solution {
    // fun solution(num1: Int, num2: Int): Int {
    //     var answer: Int = 0
    //     return num1 - num2
    // }

    // 다른사람풀이1
    // fun solution(num1: Int, num2: Int) = num1 - num2

    // 다른사람풀이2
    fun main(args:Array<String>){
        val num1: Int = readLine()!!.toInt()
        val num2: Int = readLine()!!.toInt()
        solution(num1, num2)
    }
    fun solution(num1: Int, num2: Int): Int {
        var answer = num1 - num2
        return answer
    }
    
}
