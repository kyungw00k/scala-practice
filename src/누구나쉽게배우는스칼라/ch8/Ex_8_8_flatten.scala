package 누구나쉽게배우는스칼라.ch8

/**
  * Created by humphrey.park on 2017. 1. 6..
  */
object Ex_8_8_flatten {
  def main(args: Array[String]): Unit = {
    val o = List(List(1, List(2, 1), 3, 4), List(5, 6))
    val n = o.flatten // one depth flat
    println(n) // => List(1, List(2, 1), 3, 4, 5, 6)
  }
}
