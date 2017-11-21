package com.drew.treeGeneric

sealed trait Tree[A] {
  def fold[A](value: A, f: (A, B) => A): A = {
  }
}

final case class Node[A](left: Tree[A], right: Tree[A]) extends Tree[A]

final case class Leaf[A](value: A) extends Tree[A]
