package 누구나쉽게배우는스칼라.ch7

/**
  * Created by humphrey.park on 2017. 1. 5..
  */
object Ex_7_9 {
  def main(args: Array[String]): Unit = {
    val map = Map(
      1 -> "하하하"
    )

    println(map.get(2).getOrElse("없다니깐"))
  }
}
