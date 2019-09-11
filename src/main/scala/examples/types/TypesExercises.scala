package examples.types

object TypesExercises {

  /*
   * Any
   */

  val any: Any = 42

  val anyVal: AnyVal = 42
  //  val notAnyVal: AnyVal = "" // the result type of an implicit conversion must be more specific than AnyVa

  val anyRef: AnyRef = ""
  //  val notAnyRef: AnyRef = 42 // the result type of an implicit conversion must be more specific than AnyRef

  def compare(x: Any, y: Any): String = if (x.equals(y)) "Yep" else "Nope"

  /*
   * Nothing
   */

  // What is the type of this function?
  def ??? = throw new NotImplementedError

  lazy val anyType: String = ??? // Nothing can be assigned to any type (even Any)

  /*
   * Null
   */

  val onlyInstanceOfNull: Null = null     // You can't assign anything else as Null type

  val billionDollarMistake: String = null // But the null instance can be assigned to any

//  val cantAssignNullToAnyVal: Int = null  // *** an expression of type Null is ineligible for implicit conversion
}
