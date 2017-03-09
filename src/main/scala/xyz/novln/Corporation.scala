package xyz.novln

sealed trait Corporation
object Corporation {
  case object BountyHunter extends Corporation
  case object Xenos extends Corporation
  case object Zoners extends Corporation
  case object LaneHackers extends Corporation
  case object Outcasts extends Corporation
}
