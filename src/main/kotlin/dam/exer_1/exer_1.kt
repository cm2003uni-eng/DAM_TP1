package dam.exer_1

fun a(){
    val array = IntArray(50){i ->
        (i+1)*(i+1)
    }
    println(array.joinToString())
}


fun b(){

   val array = (1..50).map { i -> i*i}

    println(array.joinToString())
}


fun c(){

    val array = Array(50) {i ->
        (i+1)*(i+1)
    }

    println(array.joinToString())
}



fun main() {
    println(a())
    println(b())
    println(c())
}