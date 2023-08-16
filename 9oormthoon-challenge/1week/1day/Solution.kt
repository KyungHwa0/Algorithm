fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    val W = input[0].toDouble()
    val R = input[1].toDouble()
    val answer = (W * (1 + R / 30)).toInt()

    println(answer)
}