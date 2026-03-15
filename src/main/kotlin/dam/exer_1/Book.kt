package org.example.dam.exer_1

abstract class Book(

    val title: String,
    val author: String,
    val initialYear: Int,
    availableCopies: Int

    ) {


    init {
        println("Book '$title' by $author has been added to the library.")
    }

    val publicationYear: String
        get() {
            return if (initialYear < 1980) {
                "Classic"
            } else if (initialYear in 1980..2010) {
                "Modern"
            } else {
                "Contemporary"
            }
        }

    var availableCopies: Int = availableCopies
        set(value) {
            if (value < 0) {
                field = 0
            } else {
                field = value
            }
            if (field == 0) {
                println("Warning: Book is now out of stock!")
            }
        }

    abstract fun getStorageInfo(): String


    override fun toString(): String {
        return "Title: $title, Author: $author, Era: $publicationYear, Available: $availableCopies copies. "
    }



}