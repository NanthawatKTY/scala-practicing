object matchExpression {
  def main(args: Array[String]):Unit ={
    val age = 12

    age match {
      case 20 => println(age)
      case 35 => println(age)
      case 12 => println(age)
      case 200 => println(age)

      //Default case
      case _ => println(age)
    }

    val result = age match {
      case 20 => age
      case 12 => age
      case 13 => age
      case 56 => age
      case 43 => age

      case _ => "Default"
    }

    println(s"Result = ${result}")

    val i =7
    i match{
      case 1 | 3| 5| 7 |9 => println("odd")
      case 2 |4 |6 |8 |10 => println("even")
    }
  }
}
