

object HelloWorld {
  /* This is my first java program.
  * This will print ‘Hello World’ as the output
  */
  def main(args: Array[String]) {
   println("Hello, world!") // prints Hello World
   def multiplyInt(d: Int, f: Int): Int = {var Result: Int = 0; Result = d * f; return Result}
  println("multiply(2,5) = " + multiplyInt(2,5))
   
  }
}

