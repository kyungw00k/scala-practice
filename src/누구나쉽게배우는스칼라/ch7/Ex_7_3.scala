package 누구나쉽게배우는스칼라.ch7

/**
  * Created by humphrey.park on 2017. 1. 5..
  */
object Ex_7_3 {
  def main(args: Array[String]): Unit = {

    val list = "a" :: "b" :: "c" :: Nil

    for( x <- list) {
      println(x)
    }

    for(x <- 0 until list.size) {
      println(list(x))
    }


    val list2 = "d" :: "e" :: Nil

    var list3 = list ::: list2

    for(x <- 0 until list3.size) {
      println(list3(x))
    }


    val list4 = "a" :: "a" :: "b" :: Nil

    val list5 = "b" :: "c" :: "a" :: Nil

    val list6 = (list4++list5).distinct


    println()

    for(x <- 0 until list6.size) {
      println(list6(x))
    }

    println( (list4++list5).mkString(","))
  }
}
