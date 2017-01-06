package ch8

/**
  * Created by humphrey.park on 2017. 1. 6..
  */
object Ex_8_8_flatten {
  def main(args: Array[String]): Unit = {
    val o = List(List(1, 2, 3, 4), List(5, 6))
    val n = o.flatten
    println(n)
  }
}
