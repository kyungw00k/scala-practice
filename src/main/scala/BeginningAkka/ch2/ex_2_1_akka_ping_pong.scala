package BeginningAkka.ch2

import akka.actor._

class Ping extends UntypedActor {
  val pong = context.actorOf(Props(new Pong(self)), "pong")

  override def onReceive(message: Any) = {
    println(s"Ping received ${message}")
    pong ! "ping"
  }
}

class Pong(ping: ActorRef) extends UntypedActor {
  override def onReceive(message: Any) = {
    println(s"Pong received ${message}")
    sender ! "pong"
  }
}

/**
  * Created by humphrey.park on 2017. 1. 9..
  */
object ex_2_1_akka_ping_pong {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem("TestSystem")
    val ping = actorSystem.actorOf(Props[Ping], "ping")

    ping ! "start"

  }
}
