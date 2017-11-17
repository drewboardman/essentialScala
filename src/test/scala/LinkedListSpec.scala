package linkedList.com.drew

import org.scalatest._

class LinkedListSpec extends FunSpec with Matchers {
  describe("length") {
    it("correctly returns length") {
      val list = Pair(1, Pair(2, Pair(8, End())))
      list.length.shouldEqual(3)
    }
  }
}
