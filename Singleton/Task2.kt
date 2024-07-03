class Counter {
    var count: Int = 0

    companion object {
        var staticCount: Int = 0

        fun get_staticCount(): Int {
            return staticCount
        }
    }
}

class Helper1 {
    var counter1 = Counter()

    fun incrementStaticCount() {
        var c = Counter.get_staticCount()++
        print("Static Counter from Helper1: ")
        println(c)
    }
}

class Helper2 {
    var counter2 = Counter()

    fun incrementStaticCount() {
         var c = Counter.get_staticCount()++
        print("Static Counter from Helper2: ")
        println(c)
    }
}

fun main() {
    var h1 = Helper1()
    h1.incrementStaticCount()

    var h2 = Helper2()
    h2.incrementStaticCount()
}
