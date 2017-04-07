package xyz.novln

class ShipSpec extends AppSpec {

  "A Ship" when {
    "empty" should {
      "have 0 crew" in {
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        ship.crew.size shouldBe 0
      }
      "be empty" in {
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        ship.isEmpty() shouldBe true
      }
    }
    "have a Corporation" in {
      val ship: Ship = Ship("foobar", Corporation.Volkov)
      ship.corporation shouldBe Corporation.Volkov
    }

    "compute average age" should {
      "have 0 crew" in {
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        Ship.avgAge(ship) shouldBe None
      }
      "have 1 crew" in {
        val p1: Human = Human("John", "Mcclane", 45, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        val ship2 = Ship.join(ship, p1)
        Ship.avgAge(ship2) shouldBe Some(45)
      }
      "have 2 crew" in {
        val p1: Human = Human("John", "Mcclane", 40, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val p2: Human = Human("John", "Mcclane", 30, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val ship = Ship.join(Ship("foobar", Corporation.Volkov), List[Human](p1, p2))
        Ship.avgAge(ship) shouldBe Some(35)
      }
    }

    "compute min age" should {
      "have 0 crew" in {
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        Ship.minAge(ship) shouldBe None
      }
      "have 1 crew" in {
        val p1: Human = Human("John", "Mcclane", 45, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        val ship2 = Ship.join(ship, p1)
        Ship.minAge(ship2) shouldBe Some(45)
      }
      "have 2 crew" in {
        val p1: Human = Human("John", "Mcclane", 40, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val p2: Human = Human("John", "Mcclane", 30, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        ShipBuilder("foobar", Corporation.Volkov, List[Human](p1, p2)).map { ship =>
          Ship.minAge(ship) shouldBe Some(30)
        }.orElse{
          fail("Fuck")
        }

      }
    }

    "compute max age" should {
      "have 0 crew" in {
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        Ship.maxAge(ship) shouldBe None
      }
      "have 1 crew" in {
        val p1: Human = Human("John", "Mcclane", 45, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val ship: Ship = Ship("foobar", Corporation.Volkov)
        val ship2 = Ship.join(ship, p1)
        Ship.maxAge(ship2) shouldBe Some(45)
      }
      "have 2 crew" in {
        val p1: Human = Human("John", "Mcclane", 40, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val p2: Human = Human("John", "Mcclane", 30, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val optShip = ShipBuilder("foobar", Corporation.Volkov, List[Human](p1, p2))
        optShip match {
          case Some(ship) => {
            Ship.maxAge(ship) shouldBe Some(40)
          }
          case _ => fail("no ship")
        }

      }
    }

  }

  "A Ship builder" when {
    "first crew member" should {
      "be captain" in {
        val human: Human = Human("John", "Mcclane", 45, Gender.Undefined, Corporation.Volkov, Some(Rank.Captain))
        val optShip: Option[Ship] = ShipBuilder("Serenity", Corporation.Volkov, human)
        optShip match {
          case None => {
            fail("got no ship")
          }
          case Some(ship) => {
            val captain = ship.crew.filter(member => {
              member.rank == Some(Rank.Captain)
            })
            captain.size shouldBe 1
          }
        }
      }
    }
  }

}