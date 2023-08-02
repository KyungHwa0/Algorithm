class Solution {
    fun solution(angle: Int): Int {
        when (true) {
            (angle < 90) -> {
                return 1
            }

            (angle == 90) -> {
                return 2
            }

            (angle == 180) -> {
                return 4
            }

            else -> {
                return 3
            }
        }
    }
}