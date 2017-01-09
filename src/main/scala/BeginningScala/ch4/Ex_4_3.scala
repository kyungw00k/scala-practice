package BeginningScala.ch4

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_4_3 {
  def main(args: Array[String]): Unit = {
    val 사과1 = Fruit2("사과")
    val 사과2 = Fruit2("사과")
    val 키위 = Fruit2("키위")

    println(사과1.name)
    println(키위.name)
    println(사과1.hashCode())
    println(사과2.hashCode())
    println(사과1 == 사과2) // true!


    println(Fruit2.name()) // true!
  }
}

case class Fruit2(name: String)

// Companion Object
object Fruit2 {
  def name(): String = {
    return "(None)"
  }
}

