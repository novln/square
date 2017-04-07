package xyz.novln

case class Ship(id: String, corporation: Corporation, crew: Set[Human] = Set.empty[Human]) {
  def isEmpty(): Boolean = {
    crew.isEmpty
  }
}

object Ship {

  def join(ship: Ship, human: Human): Ship = {
    val crew = ship.crew + human
    ship.copy(crew = crew)
  }

  def join(ship: Ship, humans: List[Human]): Ship = {
    val crew = ship.crew ++ humans
    ship.copy(crew = crew)
  }

  def leave(ship: Ship, human: Human): Ship = {
    val crew = ship.crew - human
    ship.copy(crew = crew)
  }

  def avgAge(ship: Ship): Option[Int] = {
    if (ship.isEmpty()) {
      None
    } else {
      val crew = ship.crew
      val sum = crew.map(_.age).foldLeft(0) { (previous, next) => previous + next }
      Some(sum / crew.size)
    }
  }

  def minAge(ship: Ship): Option[Int] = {
    if (ship.isEmpty()) {
      None
    } else {
      val crew = ship.crew
      val age = crew.map(_.age)
      Some(age.min)
    }
  }

  def maxAge(ship: Ship): Option[Int] = {
    if (ship.isEmpty()) {
      None
    } else {
      val crew = ship.crew
      val age = crew.map(_.age)
      Some(age.max)
    }
  }
}

object ShipBuilder {
  def apply(name: String, corporation: Corporation, human: Human): Option[Ship] = {
    human.rank match {
      case Some(Rank.Captain) => {
        val ship: Ship = Ship(name, corporation)
        Some(Ship.join(ship, human))
      }
      case _ => None
    }
  }

  def apply(name: String, corporation: Corporation, humans: List[Human]): Option[Ship] = {
    if (humans.filter(_.rank == Some(Rank.Captain)).nonEmpty) {
      val ship = Ship(name, corporation)
      Some(Ship.join(ship, humans))
    } else {
      None
    }
  }
}