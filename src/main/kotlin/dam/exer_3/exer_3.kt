package org.example.dam.exer_3

fun jump(){
    val bounceHeights = generateSequence(100.0){ previousHeight ->
        previousHeight * 0.60
    }
        .takeWhile {it >= 1.0}
        .take(15)
        .toList()

    println("Sequência de ressaltos:")
    bounceHeights.forEach{height ->
        println("%.2f".format(height))
    }
}

fun main(){
    jump()
}