package xyz.novln

class HumanSpec extends AppSpec {

  "A Human" should {
    "have a gender" in {
      val human: Human = Human("John", "Mcclane", 45, Gender.Undefined, Corporation.Volkov)
      human.gender shouldBe Gender.Undefined
    }
    "have a corporation" in {
      val human: Human = Human("John", "Mcclane", 45, Gender.Undefined, Corporation.Volkov)
      human.corporation shouldBe Corporation.Volkov
    }

  }

}