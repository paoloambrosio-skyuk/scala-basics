package examples.constructs

object PatternMatching {

  def findType(x: Any): String = x match {
    case _: String => "string"
    case _: Int => "int"
    case _ => "other" // what happens if we remove this statement?
  }
}
