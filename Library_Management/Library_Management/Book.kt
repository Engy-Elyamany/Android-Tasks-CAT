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