sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

sealed trait Rectangular extends Shape {
  def sides: Int = 4
  def height: Double
  def width: Double
  def perimeter = (2*height) + (2*width)
  def area = height*width
}

case class Circle(radius: Double) extends Shape {
  val sides = 1
  def perimeter = math.Pi*(2*radius)
  def area = math.Pi*(radius*radius)
}

case class Rectangle(height: Double, width: Double) extends Rectangular {
}

case class Square(length: Double) extends Rectangular {
  val width = length
  val height = length
}
