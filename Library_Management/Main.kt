
fun main() {
    val townLibrary = Library()
    // ----------------------- add books --------------------------------
    val book1 = Book("Harry Potter", "J.K Rowling", 2005, false)
    val book2 = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, false)
    val book3 = Book("To Kill a Mockingbird", "Harper Lee", 1960, false)
    val book4 = Book("Pride and Prejudice", "Jane Austen", 1813, false)
    val book5 = Book("1984", "George Orwell", 1949, false)
    val book6 = Book("Jane Eyre", "Charlotte Brontë", 1847, false)
    val book7 = Book("Animal Farm", "George Orwell", 1945, false)
    val book8 = Book("The Lord of the Rings", " J.R.R. Tolkien", 1945, false)
    val book9 = Book("Little Women", "Louisa May Alcott", 1869, false)
    val book10 = Book("Howl's Moving Castle", " Diana Wynne Jones", 1986, false)

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


