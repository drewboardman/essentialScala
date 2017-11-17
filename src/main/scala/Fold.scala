sealed trait IntList {
  def fold(identity: Int)(f: (Int, Int) => Int): Int = {
    this match {
      case End(_) => identity
      case Pair(h, t) => f(h, t.fold(identity)(f))
    }
  }

  def product: Int = {
    val productSum = (x: Int, y: Int) => x * y
    fold(1)(productSum)
  }

  def sum: Int = {
    def sumFunc = (x: Int, y: Int) => x + y
    fold(0)(sumFunc)
  }

  def length: Int = {
    val lengthFunc = (_: Int, agg: Int) => 1 + agg
    fold(0)(lengthFunc)
  }
}

final case class End(element: Int) extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

