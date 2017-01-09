package 누구나쉽게배우는스칼라.ch3

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_3_1 {
  def main(args: Array[String]): Unit = {
    var x = scala.io.StdIn.readInt()

    if (x > 15) {
      println("UP")
    } else if ( x < 15) {
      println("DOWN")
    } else {
      println("CORRECT")
    }
  }
}
