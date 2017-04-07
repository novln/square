package xyz.novln

import xyz.novln.Corporation._

class CorporationSpec extends AppSpec {

  "A Corporation" should {
    "if Amiga" in {
      val corporation = Amiga
      corporation shouldBe a [Corporation]
      corporation shouldBe a [MainstreamCorporation]
    }
    "if Belters" in {
      val corporation = Belters
      corporation shouldBe a [Corporation]
      corporation shouldBe a [OuterRimCorporation]
    }

  }

}