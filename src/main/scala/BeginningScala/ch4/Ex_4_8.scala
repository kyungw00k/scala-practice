package BeginningScala.ch4

/**
  * Created by humphrey.park on 2016. 12. 27..
  */
object Ex_4_8 {
  def main(args: Array[String]): Unit = {
    val robot = new Maginga

    println(robot.shoot)

    val robot2 = new SuperMaginga

    println(robot2.shoot)
  }
}


abstract class Robot {
  def shoot = "뿅뿅"
}

trait M16 extends Robot {
  override def shoot = "빵야~"
}

trait Bazooka extends Robot {
  override def shoot = "뿌앙 뿌앙~"
}

trait Daepodong extends Robot {
  override def shoot = "콰르르르"
}


class Maginga extends Robot with M16 with Daepodong with Bazooka

class SuperMaginga extends Robot with M16 with Daepodong with Bazooka {
  override def shoot = "뿌웅"
}