// fun main () {
//     val numbers = mutableListOf<Int>()

//     // 7개의 숫자를 한 줄씩 입력받음
//     for (i in 1..7) {
//         while (true) {
//             val number = readLine()!!.toInt()

//             if (number < 100) {
//                 numbers.add(number)
//                 break
//             } else {
//                 println("100보다 작은 자연수를 다시 입력 하세요")
//             }
//         }
//     }


//     val oddNumbers = numbers.filter { it % 2 != 0 }

//     if(oddNumbers.isEmpty()) {
//         println("-1")
//         return
//     }

//     val sum = oddNumbers.sum()
//     // 최소값 찾기 : minOrNull
//     val minOdd = oddNumbers.minOrNull()

//     println(sum)
//     println(minOdd)
// }

// 다른사람 코드
fun main() {
    var min = Int.MAX_VALUE

    var sum = 0

    repeat(7) {
        val n = readln().toInt()
        if(n % 2 == 1) {
            sum += n
            min = min(min,n)
        }
    }

    if(sum == 0) {
        println(-1)
    } else {
        println("$sum\n$min")
    }
}
