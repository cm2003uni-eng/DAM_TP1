package dam.exer_1;

import org.example.dam.exer_1.Book

class DigitalBook (

    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    val fileSize: Double,
    val format: String

): Book(title, author, publicationYear, availableCopies){

    override fun getStorageInfo(): String {
        return "\n Storage: Stored digitally: $fileSize MB, Format: $format"
    }


    override fun toString(): String {
        return super.toString() + getStorageInfo()
    }
}
