package xyz.novln

case class Ship(id: String, crew: Set[Human] = Set.empty[Human])

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
