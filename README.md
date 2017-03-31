# Square

## TODO List

### Level 1

- [ ] Add isEmpty on Ship class.
- [ ] An human has a gender.
- [ ] An human is a member of a Corporation.
- [ ] A ship is the property of a Corporation.
- [ ] Create a Ship builder
  * It required a Captain to order the production.
  * The captain will be the first member of its crew.

### Level 2

- [ ] We can subtype Corporation with Mainstream, Outer Rim, Alien and Criminal.
- [ ] A station is linked to a Corporation.
- [ ] A planet can have one or multiple stations.
    * Mercury, Venus, Uranus and Neptune cannot have stations.
    * Jupiter has 4 stations from each mainstream corporation.
    * Saturn has 1 station which bellong to the Belters.
- [ ] A station can sustains life inside them.
- [ ] A ship can dock on a station.
  * A ship crew can leave the ship to join the station.
  * People from the station can join a ship if there is a captain inside the ship and he/she accept them.
  * A ship can have a crew while being docked on a station.
  * Only a Captain with the same corporation as the ship can join an empty Ship.
- [ ] A ship need a captain to operate: ie leave or join a station.
- [ ] A ship with a Criminal captain only accept Criminal or Outer Rim Corporation on board.
- [ ] Compute minimum, average, maximum age on people on a station, including if they are on a ship docked.
- [ ] If a BountyHunter join a ship, it will kill any Outcasts members except if a Criminal kill it before
  * A BountyHunter has 75% to kill a Outcasts and has more reflexes.
  * An Outcasts has 50% chance to kill a BountyHunter if he miss.
  * A Lane Hackers has 10% chance to kill a BountyHunter by surprise.
  * If there is at least one BountyHunter and Outcasts left, they try it again.

### Level 3

- [ ] Add Earth & Mars planet.
- [ ] A ship can dock on earth and mars.
- [ ] Ship from Xenos cannot dock on station.
- [ ] Two human can clone an human.
  * A Xenos require two Xenos.
  * A Xenos cannot clone with another Corporation.
  * A Xenos can clone with itself.
  * If a Mainstream corporation has a clone with another Mainstream corporation, it will be a Criminal or Outer Rim corporation.
  * However, a DwarfStar require two DwarfStar, otherwise, it will always be a LaneHackers.
  * There is 5% chance a clone could be an Outcasts.
