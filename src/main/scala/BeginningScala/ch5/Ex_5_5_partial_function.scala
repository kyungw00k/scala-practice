package BeginningScala.ch5

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_5_5_partial_function {
  def main(args: Array[String]): Unit = {
    val thisYear = 2016

    val fixedValueFunction = go(thisYear, _:String)

    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")
  }

  def go(thisYear:Int, str:String) = {
    println(str + ":" + thisYear)
  }
}
