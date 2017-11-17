package linkedList.com.drew

sealed trait LinkedList[A] {
  def length: Int = {
    this match {
      case End() => 0
      case Pair(h,t) => 1 + t.length
    }
  }
}

final case class End[A]() extends LinkedList[A]

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
