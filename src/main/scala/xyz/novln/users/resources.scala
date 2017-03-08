package xyz.novln.users

import spray.json._

case class UserResource(id: String)

object UserResource {

  implicit val writer: RootJsonWriter[UserResource] = new RootJsonWriter[UserResource] {
    def write(u: UserResource): JsObject = JsObject(
        "id" -> JsString(u.id)
    )
  }

}
