class Solution {
    // fun solution(angle: Int): Int {
    //     when (true) {
    //         (angle < 90) -> {
    //             return 1
    //         }

    //         (angle == 90) -> {
    //             return 2
    //         }

    //         (angle == 180) -> {
    //             return 4
    //         }

    //         else -> {
    //             return 3
    //         }
    //     }
    // }

    // 다른사람 코드1
    // fun solution(angle: Int): Int {
    //     if(angle < 90 )
    //         return 1;
    //     if(angle == 90)
    //         return 2;
    //     if(angle < 180)
    //         return 3;
    //     return 4;
    // }

    // 다른사람 코드2
    fun solution(angle: Int): Int {
        return when {
            angle < 90 -> 1
            angle == 90 -> 2
            angle < 180 -> 3
            else -> 4
        }
    }
}
