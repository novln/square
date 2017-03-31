package xyz.novln

import xyz.novln.Corporation._

sealed trait Corporation
object Corporation {

  trait MainstreamCorporation extends Corporation
  trait OuterRimCorporation extends Corporation
  trait AlienCorporation extends Corporation
  trait CriminalCorporation extends Corporation

  case object Volkov extends MainstreamCorporation
  case object DwarfStar extends MainstreamCorporation
  case object Traugot extends MainstreamCorporation
  case object Amiga extends MainstreamCorporation

  case object Belters extends OuterRimCorporation
  case object BountyHunter extends OuterRimCorporation
  case object Zoners extends OuterRimCorporation

  case object Xenos extends AlienCorporation

  case object LaneHackers extends CriminalCorporation
  case object Outcasts extends CriminalCorporation

}
