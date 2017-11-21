package com.drew.polymorphic

sealed trait Tree {
  def sum: Int
  def double: Tree
}

final case class Leaf(el: Int) extends Tree {
  def sum = this.el
  def double = Leaf(2*this.el)
}

final case class Node(l: Tree, r: Tree) extends Tree {
  def sum = l.sum + r.sum
  def double = Node(l.double, r.double)
}
