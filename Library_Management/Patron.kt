class Patron(var name: String, var checkedOutBooks: MutableList<Book> = mutableListOf()) {

    fun displayPatronInfo() {
        println(checkedOutBooks)
    }

    override fun toString(): String {
        return name
    }
}
