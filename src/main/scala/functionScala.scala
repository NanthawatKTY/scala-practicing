object functionScala {

  object Math{
    def add(x: Int , y: Int): Int = x+y
    def square(x: Int): Int = x*x
  }
  def add(x: Int , y: Int): Int = {
    x + y
  }
  def minus(x: Int , y: Int): Int = {
    x - y
  }
  def multiply(x: Int , y: Int): Int = x * y

  def divide(x: Int, y: Int): Int = x / y

  def main(args: Array[String]): Unit ={
    println(Math.add(2,9))
    println(Math square 50) //for one args

    println(add(10, 100))
    println(minus(10, 100))
    println(multiply(10, 100))
    println(divide(10, 100))
  }
}
