package xyz.novln

trait Station {
  def corporation: Corporation
}

case class AmigaStation() extends Station{
  val corporation = Corporation.Amiga
}
case class VolkovStation() extends Station{
  val corporation = Corporation.Volkov
}
case class DwarfStarStation() extends Station{
  val corporation = Corporation.DwarfStar
}
case class TraugotStation() extends Station{
  val corporation = Corporation.Traugot
}
case class BeltersStation() extends Station {
  val corporation = Corporation.Belters
}