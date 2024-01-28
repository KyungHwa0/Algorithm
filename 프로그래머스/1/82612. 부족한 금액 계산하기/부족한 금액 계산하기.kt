class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val totalCost = price.toLong() * count * (count + 1) / 2
        val shortage = totalCost - money

        return if (shortage > 0) shortage else 0
    }
}