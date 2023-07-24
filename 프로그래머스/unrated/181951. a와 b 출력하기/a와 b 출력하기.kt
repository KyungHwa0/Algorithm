fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
     if (a !in -100_000..100_000 || b !in -100_000..100_000) {
        println("a와 b는 -100,000에서 100,000 사이의 값이어야 합니다.")
    } else {
        println("a = $a")
        println("b = $b")
    }
}