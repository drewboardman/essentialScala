trait Feline {
  def color: String
  def sound: String
}

case class Cat(color: String, favoriteFood: String) extends Feline {
  val sound = "meow"
}

case class Lion(color: String, maneSize: Int) extends Feline {
  val sound = "roar"
}
