package xyz.novln

import xyz.novln.Corporation._

class PlanetSpec extends AppSpec {

  "Jupiter" should {
    "have a amiga station" in {
      Planet.Jupiter.amiga.corporation shouldEqual Amiga
    }
    "have a volkov station" in {
      Planet.Jupiter.volkov.corporation shouldEqual Volkov
    }
    "have a traugot station" in {
      Planet.Jupiter.traugot.corporation shouldEqual Traugot
    }
    "have a dwarf star station" in {
      Planet.Jupiter.dwarfStar.corporation shouldEqual DwarfStar
    }
  }

  "Saturn" should {
    "have a belters station" in {
      Planet.Saturn.station.corporation shouldEqual Belters
    }
  }


}