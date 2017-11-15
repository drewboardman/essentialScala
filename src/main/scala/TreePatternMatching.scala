sealed trait Tree

final case class Node(left: Tree, right: Tree) extends Tree

final case class Leaf(element: Int) extends Tree

object TreeCalc {
  def sum(tree: Tree): Int = {
    tree match {
      case Leaf(element) => element
      case Node(l, r) => sum(l) + sum(r)
    }
  }

  def double(tree: Tree): Tree = {
    tree match {
      case Leaf(e) => Leaf(2*e)
      case Node(l,r) => {
        val newLeft = double(l)
        val newRight = double(r)
        Node(newLeft, newRight)
      }
    }
  }
}
