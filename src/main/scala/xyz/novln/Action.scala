package xyz.novln

sealed trait Action[+A]
object Action {
  case object Miss extends Action[Nothing]
  case object Failure extends Action[Nothing]
  case class Success[A](instance: A) extends Action[A]
}
