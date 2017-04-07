package xyz.novln

sealed trait Corporation
object Corporation {
  trait MainstreamCorporation extends Corporation
  case object Volkov extends MainstreamCorporation
  case object DwarfStar extends MainstreamCorporation
  case object Traugot extends MainstreamCorporation
  case object Amiga extends MainstreamCorporation

  trait OuterRimCorporation extends Corporation
  case object Belters extends OuterRimCorporation
  case object BountyHunter extends OuterRimCorporation
  case object Zoners extends OuterRimCorporation

  trait AlienCorporation extends Corporation
  case object Xenos extends AlienCorporation

  trait CriminalCorporation extends Corporation
  case object LaneHackers extends CriminalCorporation
  case object Outcasts extends CriminalCorporation

}