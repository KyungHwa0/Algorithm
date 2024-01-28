class Solution {
    // fun solution(price: Int, money: Int, count: Int): Long {
        // val totalCost = price.toLong() * count * (count + 1) / 2
        // val shortage = totalCost - money

        // return if (shortage > 0) shortage else 0

    // 다른사람 풀이
    fun solution(price: Int, money: Int, count: Int): Long = (1..count).map { it * price.toLong() }.sum().let { if (money > it) 0 else it - money }
    }
}
