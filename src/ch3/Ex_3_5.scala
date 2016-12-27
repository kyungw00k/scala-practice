package ch3

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_3_5 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 until 10) {
      println(x)
    }

    println("-----")

    for (x <- 1 until 10 drop (3)) {
      // 앞에 3개 버림
      println(x)
    }

    println("-----")

    for (x <- 1 until 10 dropRight (3)) {
      // 뒤에 3개 버림
      println(x)
    }

    println("-----")

    for (x <- 1 until 10 by 3) { // 3 씩 건너 뜀
      println(x)
    }

    println("-----")

    for (x <- 1 until 10 by 3 drop(1)) { // 3 씩 건너 뛴 결과에서 왼쪽 1개 버림
      println(x)
    }

    println("-----")

    for (x <- 1 until 10 by 3 dropRight(1)) { // 3 씩 건너 뛴 결과에서 오른쪽 1개 버림
      println(x)
    }
  }
}
