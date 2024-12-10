class Solution {
    fun solution(
        video_len: String,
        pos: String,
        op_start: String,
        op_end: String,
        commands: Array<String>
    ): String {
        // "mm:ss"를 초로 변환하는 함수
        fun timeToSeconds(time: String): Int {
            val (mm, ss) = time.split(":").map { it.toInt() }
            return mm * 60 + ss
        }

        // 초를 "mm:ss" 형식으로 변환하는 함수
        fun secondsToTime(seconds: Int): String {
            val mm = seconds / 60
            val ss = seconds % 60
            return String.format("%02d:%02d", mm, ss)
        }

        // video_len을 초 단위로 변환
        val videoLengthInSeconds = timeToSeconds(video_len)
        // pos, op_start, op_end를 초 단위로 변환
        var currentPos = timeToSeconds(pos)
        val openingStart = timeToSeconds(op_start)
        val openingEnd = timeToSeconds(op_end)

        // 명령어 처리 전에 항상 오프닝 구간 확인
        if (currentPos in openingStart..openingEnd) {
            currentPos = openingEnd
        }

        // 각 명령어 처리
        for (command in commands) {
            when (command) {
                "prev" -> {
                    // prev는 10초 전으로 이동, 0초 미만으로 가지 않음
                    currentPos = maxOf(currentPos - 10, 0)
                }
                "next" -> {
                    // next는 10초 후로 이동, videoLength를 초과하지 않음
                    currentPos = minOf(currentPos + 10, videoLengthInSeconds)
                }
            }

            // 오프닝 건너뛰기: 현재 위치가 오프닝 구간 내에 있으면 오프닝 끝으로 이동
            if (currentPos in openingStart..openingEnd) {
                currentPos = openingEnd
            }
        }

        return secondsToTime(currentPos)
    }
}
