fun main() {
    var townLibrary = Library()
    // ----------------------- add books --------------------------------
    var book1 = Book("Harry Potter", "J.K Rowling", 2005, false)
    var book2 = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, false)
    var book3 = Book("To Kill a Mockingbird", "Harper Lee", 1960, false)
    var book4 = Book("Pride and Prejudice", "Jane Austen", 1813, false)
    var book5 = Book("1984", "George Orwell", 1949, false)
    var book6 = Book("Jane Eyre", "Charlotte Brontë", 1847, false)
    var book7 = Book("Animal Farm", "George Orwell", 1945, false)
    var book8 = Book("The Lord of the Rings", " J.R.R. Tolkien", 1945, false)
    var book9 = Book("Little Women", "Louisa May Alcott", 1869, false)
    var book10 = Book("Howl's Moving Castle", " Diana Wynne Jones", 1986, false)

    townLibrary.addBook(book1)
    townLibrary.addBook(book2)
    townLibrary.addBook(book3)
    townLibrary.addBook(book4)
    townLibrary.addBook(book5)
    townLibrary.addBook(book6)
    townLibrary.addBook(book7)
    townLibrary.addBook(book8)
    townLibrary.addBook(book9)
    townLibrary.addBook(book10)

    println("\n____________ Library Status ____________\n")
    townLibrary.displayLibrary()

    // --------------- a patron checks out a book -------------
    val sub1 = Patron("Ali Mohammed", mutableListOf(book3, book8))
    townLibrary.checkOutBook(sub1, sub1.checkedOutBooks)

    // --------------- a patron returns a book ----------------
    townLibrary.returnBook(sub1, book8)

    println("\n____________ another patron ____________\n")

    val sub2 = Patron("Farida Hany", mutableListOf(book1, book5, book9))
    townLibrary.checkOutBook(sub2, sub2.checkedOutBooks)

    // --------------- library status ----------------
    println("\n____________ Library Status ____________\n")
    townLibrary.displayLibrary()
}



// -------------- class book ------------------------
class Book(
    var title: String,
    var author: String,
    var publicationYear: Int,
    var isCheckedOut: Boolean
) : LibraryItem {

    override fun checkOut(): Boolean {
        if (isCheckedOut == true) {
            return true
        } else return false
    }

    override fun returnItem(): Boolean {
        if (isCheckedOut == false) {
            return true
        } else return false
    }

    override fun isAvailable(): Boolean {
        if (isCheckedOut == false) {
            return true
        } else return false
    }

    override fun toString(): String {
        return "Title : $title , Author : $author , Publication Year : $publicationYear , Is checked Out : $isCheckedOut"
    }
}
// -------------- interface library item ---------------------------
interface LibraryItem {
    fun checkOut(): Boolean

    fun returnItem(): Boolean

    fun isAvailable(): Boolean
}

// -------------- class patron ------------------------
class Patron(var name: String, var checkedOutBooks: MutableList<Book> = mutableListOf()) {

    fun displayPatronInfo() {
        println(checkedOutBooks)
    }

    override fun toString(): String {
        return name
    }
}

// -------------- class Library ------------------------
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
