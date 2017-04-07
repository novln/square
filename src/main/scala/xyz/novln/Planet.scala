package xyz.novln

sealed trait Planet

object Planet {
  case object Mercury extends Planet
  case object Venus extends Planet
  case object Jupiter extends Planet {
    val amiga: AmigaStation = AmigaStation()
    val volkov: VolkovStation = VolkovStation()
    val dwarfStar: DwarfStarStation = DwarfStarStation()
    val traugot: TraugotStation = TraugotStation()
  }
  case object Saturn extends Planet {
    val station = BeltersStation()
  }
  case object Uranus extends Planet
  case object Neptune extends Planet
}