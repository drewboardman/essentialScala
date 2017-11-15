sealed trait Treep {
  def sum: Int
  def double: Treep
}

final case class Leafp(el: Int) extends Treep {
  def sum = this.el
  def double = Leafp(2*this.el)
}

final case class Nodep(l: Treep, r: Treep) extends Treep {
  def sum = l.sum + r.sum
  def double = Nodep(l.double, r.double)
}
