package org.example.dam.exer_1

class PhysicalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    val weight: Double,
    var hasHardCover: Boolean = true
) : Book(title, author, publicationYear, availableCopies) {


    override fun getStorageInfo(): String {
        val hc_value =if(hasHardCover)"Yes"  else "No"
        return "\n Storage: Physical book: $weight g, Hardcover: $hc_value"
    }

    override fun toString(): String {
        return super.toString() + getStorageInfo()
    }
}