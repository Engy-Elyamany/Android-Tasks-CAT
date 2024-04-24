class Library() {
    var libraryBooks = mutableMapOf<String, Book>()

    fun addBook(book: Book) {
        libraryBooks.put(book.title, book)
    }

    fun displayLibrary() {
        for (i in libraryBooks) println("📖$i")
    }

    fun removeBook(book: Book) {
        libraryBooks.remove(book.title)
    }

    fun checkOutBook(patron: Patron, pList: MutableList<Book>): Boolean {
        var flag = 0
        for (book in pList) {
            if (book.isCheckedOut == false) {
                book.isCheckedOut = true
                println("⏪ $patron checked out this book :- $book")
                flag = 1
            } else flag = 0
        }
        if (flag == 1) return true else return false
    }

    fun returnBook(patron: Patron, book: Book): Boolean {
        if (book.isCheckedOut == true) {
            book.isCheckedOut = false
            patron.checkedOutBooks.remove(book)
            println("🔁$patron returned this book :- $book")
            return true
        } else return false
    }
}
