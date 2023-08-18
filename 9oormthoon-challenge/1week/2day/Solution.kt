fun main(args: Array<String>) {
    // 기능의 수
    val N = readLine()!!.toInt()

    // 시작시간
    val inputTime = readLine()!!.split(" ")
    val hour = inputTime[0].toInt()
    val min = inputTime[1].toInt()

    // 기능별 개발 시간을 한 줄씩 입력받기
    var total = 0
    for(i in 0 until N) {
        val time = readLine()!!.toInt()
        total += time
    }

    // 완료시간 계산
    var sumHour = hour + (min + total) / 60
    var sumMin = (min + total) % 60

    //결과 출력
    println("${sumHour % 24} $sumMin")
}