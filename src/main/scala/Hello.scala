
// Longer Version //
//object Hello {
//
//  def main(args:Array[String]) :Unit = {
//    println("Hello Scala")
//  }
//}
class Person(val name: String, val id: Int) //Adding val can made variables are PUBLIC

// Shorter Version //
object Hello extends App{

  val aPerson = new Person(name = "John Moxry", id = 1)
  println(s"${aPerson.name} has id: ${aPerson.id}")
  println(s"Hello \nWorld")
  println(raw"Hello \nWorld")
}
