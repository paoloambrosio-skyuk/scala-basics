package examples.constructs

object ForComprehension {

  val result = for {
    first <- getFirst
    second <- getSecond(first)
  } yield second

  def getFirst: Option[Int] = Some(4)
  def getSecond(x: Int): Option[Int] = Some(10 * x + 2)

  val doubleFirst25 = for (x <- 1 to 25) yield 2 * x
  // Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50)



}
