import kotlin.properties.Delegates

open class Task {
    var title: String = ""
    var description: String = ""
    var completed: Boolean by Delegates.observable(false) { property, oldValue, newValue ->
        println("Task completed\n$newValue")
    }
    
     val user: String by lazy{
         "mai"
     }
}

class importantTask : Task() {
    var priority: Int  by Delegates.vetoable(0) { property, oldValue, newValue ->
        println("The priority has changed from $oldValue to $newValue")
        println(newValue)
        newValue >= 0
    }
}

fun main() {
    val task = importantTask()
    print("User is ")
     println(task.user)
     println(task.user.uppercase())
     println(task.user.uppercase())
      println("------------------")
    task.title="Reading"
    task.description = "Reading a science book"
    println(task.title)
     println(task.description)
     println("------------------")
    task.priority = 3
    task.priority = -3
    println("------------------")
    task.completed = true
}
