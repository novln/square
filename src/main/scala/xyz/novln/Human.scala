package xyz.novln

sealed trait Gender
object Gender {
  case object Male extends Gender
  case object Female extends Gender
  case object Undefined extends Gender
}


case class Human(firstName: String,
                 lastName: String,
                 age: Integer,
                 gender: Gender,
                 corporation: Corporation,
                 rank: Option[Rank] = None)
