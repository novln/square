package xyz.novln

import akka.http.scaladsl.server.HttpApp
import akka.http.scaladsl.server.Route
import xyz.novln.http.JsonSupport
import xyz.novln.users.UserResource

object Server extends HttpApp with JsonSupport {

  def route: Route = {
    path("ping") {
      get {
        complete(UserResource("4567-6786-6966"))
      }
    }
  }

}

object Application extends App {
    Server.startServer("127.0.0.1", 8080)
}
