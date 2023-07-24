import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    
    if (a > 0 && a < 10 && b > 0 && b < 10) {
        println(a + b)
    } else {
        println("입력한 숫자가 유효한 범위(0 < A, B < 10)에 있지 않습니다.")
    }
}