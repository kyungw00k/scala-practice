package BeginningScala.ch2

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_2_type_alias {
  type Name = String
  type Person = (String, Int)
  type FType = String => Int

  def main(args: Array[String]): Unit = {
    val name: Name = "박경욱"

    val p: Person = ("A", 1)
    val f: FType = text => text.toInt

    println(name == "박경욱") // true? true
    println(p == ("A", 1)) // true? true
    println(f("10")) // expected 10
    println(f("a")) // Runtime Exception
  }
}
