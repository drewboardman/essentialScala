sealed trait IntList {
  def fold(end: Int, func: (Int, Int) => Int): Int = {
    this match {
      case End(_) => end
      case Pair(head, tail) => func(head, tail.fold(end, func))
    }
  }

  def sum: Int = {
    fold(0, (head, tail) => head + tail)
  }

  def length: Int = {
    fold(0, (head, tail) => 1 + tail)
  }

  def product: Int = {
    fold(1, (head, tail) => head * tail)
  }
}

case class Pair(head: Int, tail: IntList) extends IntList

case class End(value: Int) extends IntList