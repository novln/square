package xyz.novln

sealed trait Corporation
object Corporation {
  // Mainstream Corportation
  case object Volkov extends Corporation
  case object DwarfStar extends Corporation
  case object Traugot extends Corporation
  case object Amiga extends Corporation
  // Outer Rim Corporation
  case object Belters extends Corporation
  case object BountyHunter extends Corporation
  case object Zoners extends Corporation
  // Alien Corporation
  case object Xenos extends Corporation
  // Criminal Corporation
  case object LaneHackers extends Corporation
  case object Outcasts extends Corporation
}
