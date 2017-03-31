package xyz.novln

class ShipSpec extends AppSpec {

  "A Ship" when {
    "empty" should {
      "have 0 crew" in {
        val ship: Ship = Ship("foobar")
        ship.crew.size shouldBe 0
      }
    }
  }

}
