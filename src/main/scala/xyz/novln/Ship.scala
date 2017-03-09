package xyz.novln

case class Ship(id: ShipIdentifier, crew: Set[Human] = Set.empty[Human])

object Ship {

  def join(ship: Ship, human: Human): Ship = {
    val crew = ship.crew + human
    ship.copy(crew = crew)
  }

  def leave(ship: Ship, human: Human): Ship = {
    val crew = ship.crew - human
    ship.copy(crew = crew)
  }

}

trait ShipIdentifier {
  def id: String
  override def toString() = id
}

object ShipIdentifier {

  def apply(id: String): Option[ShipIdentifier] = {
    Some(ShipIdentifierImpl(id))
  }

  private case class ShipIdentifierImpl(id: String) extends ShipIdentifier

}
