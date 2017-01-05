package ch7

/**
  * Created by humphrey.park on 2016. 12. 28..
  */
object Ex_7_1 {
  def main(args: Array[String]): Unit = {
    //    val array: Array[Int] = new Array[Int](10)
    //    val array = new Array[Int](10)
    //    val array = Array(1, 2, 3, 4, 5, 6, 7, 8)
    val array = Array(1, "2", 4, "hi", 6, 7.312, 8)

    for (x <- array) {
      println(x)
    }
  }
}
