class Solution {
    // fun solution(num1: Int, num2: Int): Int {
    //     var answer: Int = 0
        
    //     if(num1 == num2) {
    //         return 1
    //     }else {
    //         return -1
    //     }
    // }

    // 다른사람 코드1
    // fun solution(num1: Int, num2: Int) = if(num1==num2) 1 else -1

    // 다른사람 코드2
    fun solution(num1: Int, num2: Int): Int = when(num1==num2){
        true -> 1
        false -> -1
    }
}
