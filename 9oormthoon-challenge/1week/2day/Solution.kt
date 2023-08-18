fun main(args: Array<String>) {
    // 기능의 수
    val N = readLine()!!.toInt()
    // 기능별 개발 시간
    val timeInput = readLine()!!.split(" ")
    var total = 0
    for(i in 0 until N) {
        total += timeInput[i].toInt()
    }

    // 시작시간
    val T = readLine()!!.toInt()
    // 완료시간 계산
    var hour = T + total / 60
    var min = total % 60
    //결과 출력
    println("{$hour % 24} ${min}")
}