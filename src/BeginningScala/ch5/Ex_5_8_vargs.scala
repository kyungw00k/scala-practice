package 누구나쉽게배우는스칼라.ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_8_vargs {
  def main(args: Array[String]): Unit = {
    printlnStrings("1", "2", "3")
  }

  def printlnStrings(args:String*) = {
    for ( arg <- args ) {
      println(arg)
    }
  }
}
