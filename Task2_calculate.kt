fun main(){
  var sum : (Int, Int) -> Int = {n1, n2 -> (n1 + n2)}

  var minus : (Int, Int) -> Int = {n1, n2 -> (n1 - n2)}

  var multiply : (Int, Int)  -> Int = {n1, n2 -> (n1 * n2)}

  println(calculate(1, 2, sum))
  println(calculate(5, 4, minus))
  println(calculate(2, 3, multiply))
}

fun calculate(n1: Int, n2: Int, return_fun: (Int, Int) -> Int) : Int {
  return return_fun(n1, n2)
}
