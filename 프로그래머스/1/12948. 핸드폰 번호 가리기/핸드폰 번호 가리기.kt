class Solution {
    fun solution(phoneNumber: String): String {
        return "*".repeat(phoneNumber.length - 4) + phoneNumber.takeLast(4)
    }
}