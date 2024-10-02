fun main() {
    val a = readln().toInt()
    if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
        println(1)
    }else {
        print(0)
    }
}