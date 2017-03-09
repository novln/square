package xyz.novln

sealed trait Rank {
  def rank: Integer
}

object Rank {

  case object Captain extends Rank {
    val rank = 0
  }

  case object Chief extends Rank {
    val rank = 1
  }

  case object Officer extends Rank {
    val rank = 2
  }

  case object Pilot extends Rank {
    val rank = 3
  }

  case object Navigator extends Rank {
    val rank = 5
  }

  case object Assistant extends Rank {
    val rank = 6
  }

  case object Engineer extends Rank {
    val rank = 5
  }

  case object Surgeon extends Rank {
    val rank = 4
  }

}
