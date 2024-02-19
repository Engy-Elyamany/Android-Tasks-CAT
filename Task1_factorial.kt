fun main() {
 var fact=1
var n = readLine()!!
 for(i in n.toInt() downTo 1 step 1)
 {
    fact*=i
 }
println(fact)
}
