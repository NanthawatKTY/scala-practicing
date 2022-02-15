object ifElseState extends App {
  val a = 1
  var summ = ""
  if(a == 20){
    summ = "a !== 20"
  }else{
    summ = "a == 1"
  }

  println(summ)

  val sum2 = if (a != 20)"a != 20" else "a = 1"
  println(sum2)
}
