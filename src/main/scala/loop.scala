
object loop {
  def main(args: Array[String]): Unit ={
//While & Do-While
//    var x = 0;
//
//    while (x < 10){
//      println(s"x = $x")
//      x += 1
//    }

//    println("\n")
//    var y = 0
//    while (y < 10) {
//      println(s"y = $y")
//      y += 1
//    }
//------------------------

//For loop
    //.to and .until = Range
//    for(i <- 1.to(5)){  //var i = 0; i <= 5; i++
//      println(i)
//    }
//
//    for(i <- 1.until(6)){
//      println(i)
//    }
//
//    for(i <- 1.until(6)){
//      println(i)
//    }

//    for(i <- 1 to 9; j <- 1 to 3){
//      println(s"a pair of number is $i $j")
//    }

    val listArray = List(1,2,3,456,78,9)
//    for (i <- listArray){println(s"List have $listArray")}

//    for(i <- listArray; if i > 0 && i <10){println(s"i using filter: $i")}

    //yield keyword will returns a result after completing of loop iterations.
    //Therefore a Map yields a Map, a List yields a List
    val result = for {i <- listArray if i > 0 && i <10} yield {i*i}
    println(result)
  }
}


