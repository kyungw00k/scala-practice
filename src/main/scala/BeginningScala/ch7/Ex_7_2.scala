package BeginningScala.ch7

/**
  * Created by humphrey.park on 2017. 1. 5..
  */
object Ex_7_2 {
  def main(args: Array[String]): Unit = {
    val array = Array("str", 12.32, "hi")

    for (x <- array) {
      println(x)
    }

    val matrix = Array.ofDim[Int](4, 5)

    println(matrix(2)(3))
  }
}
