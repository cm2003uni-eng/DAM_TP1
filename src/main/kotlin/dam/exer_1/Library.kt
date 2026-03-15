package org.example.dam.exer_1

import dam.exer_1.DigitalBook

class Library(Name: String) {

    private val books = mutableListOf<Book>()
    private var totalBooks: Int = 0


    fun addBook(book: Book){
        books.add(book)
        totalBooks++
    }

    fun borrowBook(title: String){
        val book = books.find {it.title == title}
        if(book != null){
            if (book.availableCopies > 0){

                println("Successfully borrowed '${book.title}'. Copies remaing ${book.availableCopies -1}.")
                book.availableCopies--

            }
        }
    }

    fun returnBook(title: String){
        val book = books.find {it.title == title}
        if(book != null){
            book.availableCopies++
            println("Book '${book.title}' returned successfully. Copies available: ${book.availableCopies}.")
        }
    }


    fun showBooks(){
        println("\n--- Library Catalog ---")
        if (books.isEmpty()){
            println("No books found.")
        } else{
            for (book in books){
                println(book)
                println("--------------------------------")
            }
        }
    }

    fun searchByAuthor(author: String){
        println("Books by $author:")
        for (book in books){
            if(author == book.author){
                println(" - ${book.title} (${book.publicationYear}, ${book.availableCopies} copies remaining)")
            }
        }
    }
}

fun main(){
    val library = Library("Central Library")

    val digitalBook = DigitalBook(
        "Kotlin in Action",
        "Dmitry Jemerov",
        2017,
        5,
        4.5,
        "PDF")

    val physicalBook = PhysicalBook(
        "Clean Code",
        "Robert C. Martin",
        2008,
        3,
        650.0,
        true
    )

    val classicBook = PhysicalBook(
        "1984",
        "George Orwell",
        1949,
        2,
        400.0,
        false
    )

    library.addBook(digitalBook)
    library.addBook(physicalBook)
    library.addBook(classicBook)

    library.showBooks()


    println("\n--- Borrowing Books ---")
    library.borrowBook("Clean Code")
    library.borrowBook("1984")
    library.borrowBook("1984")
    library.borrowBook("1984")

    println("\n--- Returning Books ---")
    library.returnBook("1984")

    println("\n--- Search by Author ---")
    library.searchByAuthor("George Orwell")
}


