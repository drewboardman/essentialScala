package com.drew.treeGeneric

import org.scalatest._

class TreeGenericSpec extends FunSpec with Matchers {
  describe("toString") {
    it("correctly outputs a string given a tree") {
      val tree: Tree[String] =
          Node(
            Node(Leaf("To"), Leaf("iterate")),
            Node(
              Node(Leaf("is"), Leaf("human,")),
              Node(Leaf("to"), Node(Leaf("recurse"), Leaf("divine")))
            )
          )
      tree.toString.shouldEqual("To iterate is to recurse")
    }
  }
}
