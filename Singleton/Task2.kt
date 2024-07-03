class Counter {
    var count: Int = 0

    companion object {
        var staticCount: Int = 0
    }
}

class Helper1 {
    val counter1 = Counter()

    fun incrementCount() {
        counter1.count++
        print("Counter from Helper1: ")
        println(counter1.count)
    }

    fun incrementStaticCount() {
        Counter.staticCount++
        print("Static Counter from Helper1: ")
        println(Counter.staticCount)
    }
}

class Helper2 {
    val counter2 = Counter()

    fun incrementCount() {
        counter2.count++
        print("Counter from Helper2: ")
        println(counter2.count)
    }

    fun incrementStaticCount() {
        Counter.staticCount++
        print("Static Counter from Helper2: ")
        println(Counter.staticCount)
    }
}

fun main() {
    var h1 = Helper1()
    var h2 = Helper2()

    h1.incrementStaticCount()
    h2.incrementStaticCount()
    h1.incrementStaticCount()
    h2.incrementStaticCount()

    println("--------------------------------")

    h1.incrementCount()
    h2.incrementCount()
    h1.incrementCount()
    h2.incrementCount()
}
