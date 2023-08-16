class Solution {
        // fun solution(sides: IntArray): Int {
        //     sides.sort()
        //     return if(sides[2] < sides[0] + sides[1]) {
        //         1
        //     }else {
        //         2
        //     }
        // }

        // 다른사람 풀이1 (let 알아보기)
        fun solution(sides: IntArray) = sides.sorted().let { (x, y, z) -> if (x + y > z) 1 else 2 }
    }
