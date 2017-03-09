package xyz.novln

object Application extends App {

  ShipIdentifier("Xvc33") match {
    case Some(id) => {

      val emptyShip = Ship(id)
      val crewMember = Human("Thomas", "LE ROUX", 25)
      val shipWithCrew = Ship.join(emptyShip, crewMember)

      println(shipWithCrew)

    }
    case None => {
      System.err.println("Cannot create ship identifier")
      System.exit(255)
    }
  }

}
