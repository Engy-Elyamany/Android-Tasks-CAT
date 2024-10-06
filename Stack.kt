class Stack<T>() {
    var top: Int = -1
    var length: Int = 0
    var arr = mutableListOf<T>()

    fun isEmpty(): Boolean {
        return (top == 0)
    }

    fun push(element: T) {
        arr.add(element)
        top += 1
        length += 1
    }

    fun pop() {
        if (isEmpty()) print("Stack is Empty , Nothing to pop!!")
        else {
            println("Top element is Deleted !")
            arr.remove(arr[top])
            top -= 1
            length -= 1
        }
    }

    fun size() {
        println("The size of the stack = $length")
    }

    fun peek() {
        print("The top element = ")
        println(arr[top])
    }

    fun print() {
        for (n in arr) print("$n ")

        println()
    }
}

fun main() {
    val obj = Stack<Int>()
    obj.push(10)
    obj.push(20)
    obj.push(30)
    obj.print()
    obj.peek()
    obj.size()
    obj.pop()
    obj.print()
}
