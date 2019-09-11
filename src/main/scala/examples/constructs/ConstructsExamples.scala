package examples.constructs

object ConstructsExamples {

  // Java style
  class Point1(var x: Int, var y: Int) {

    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }
  }

  // Scala style
  case class Point2(x: Int, y: Int) { // immutable fields

    def move(dx: Int, dy: Int): Point2 = // "mutations" return same type
      copy(x = x + dx, y = y + dy) // case classes implement copy method
  }

}
