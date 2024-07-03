class Counter{
    var count:Int = 0
}

object counterSingleton{
    var countSingleton:Int = 0
}

fun main() {
// ---------Counter Class Objects------------
    var c1 = Counter()
    var c2 = Counter()
    c1.count += 2
    c2.count ++
    
    print("Test1 Count : ")
    println(c1.count)
    
    print("Test2 Count : ")
    println(c2.count)
    
// ----------Singleton instance------------
    counterSingleton.countSingleton += 2
        counterSingleton.countSingleton ++
    
    print("Singleton1 Count : ")
    println(counterSingleton.countSingleton )
    
    print("Singleton2 Count : ")
    println(counterSingleton.countSingleton )
}
