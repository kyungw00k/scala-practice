package ch7

/**
  * Created by humphrey.park on 2017. 1. 5..
  */
object Ex_7_6 {
  def main(args: Array[String]): Unit = {
    var map = Map(
      "num1" -> "aa",
      "num2" -> "bb",
      "num3" -> 3
    )

    println(map.isEmpty)
    println(map)
    println(map.keys)
    println(map.values)

    map += ("num4" -> 5)

    println(map.values)
  }
}
