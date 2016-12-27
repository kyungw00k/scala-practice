package ch3

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_3_8_two_for_loop_oneliner {
  def main(args: Array[String]): Unit = {
    for (x <- 1 until 5; y <- 1 until 5) {
      println(x,y)
    }

    for (x <- 1 until 5; y <- 1 until 5; z <- 1 until 3) {
      println(x,y,z)
    }
  }
}
