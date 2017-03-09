package xyz.novln

sealed trait Planet
object Planet {
  case object Mercury extends Planet
  case object Venus extends Planet
  case object Jupiter extends Planet
  case object Saturn extends Planet
  case object Uranus extends Planet
  case object Neptune extends Planet
}
