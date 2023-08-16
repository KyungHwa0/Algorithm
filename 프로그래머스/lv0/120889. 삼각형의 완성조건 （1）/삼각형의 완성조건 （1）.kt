class Solution {
        fun solution(sides: IntArray): Int {
            sides.sort()
            return if(sides[2] < sides[0] + sides[1]) {
                1
            }else {
                2
            }
        }
    }