package BeginningScala.ch4

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.swim
    flyingWhale.fly
  }

  class Animal extends Flying with Swimming {
    //    override def fly: Unit = println("날다 떨어져요~")
  }

  trait Flying {
    def fly = println("날아요 날아~")
  }

  trait Swimming {
    def swim = println("촤아~ 촤아~ 헤엄칩니다")
  }

}
