package xyz.novln

case class Human(firstName: String,
                 lastName: String,
                 age: Integer,
                 rank: Option[Rank] = None)
