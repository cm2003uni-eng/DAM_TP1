package org.example.dam.exer_2

import java.util.*

fun calculadora() {
    val scanner = Scanner(System.`in`)

    println("Escolha a operação:")
    println("1. Adição")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")
    println("5. AND (&&)")
    println("6. OR (||)")
    println("7. NOT (!)")
    println("8. Left shift (shl)")
    println("9. Right shift (shr)")

    try {
        val opcao = scanner.nextInt()

        when (opcao) {
            in 1..4 -> {
                println("Número 1:")
                val n1 = scanner.nextInt()
                println("Número 2:")
                val n2 = scanner.nextInt()

                val res = when (opcao) {
                    1 -> n1 + n2
                    2 -> n1 - n2
                    3 -> n1 * n2
                    4 -> {
                        if (n2 == 0) throw ArithmeticException("Divisão por zero!")
                        n1 / n2
                    }
                    else -> 0
                }

                println("Resultado Decimal: $res")
                println("Resultado Hex: ${Integer.toHexString(res).uppercase()}")
            }

            5, 6 -> {
                println("Valor 1 (true/false):")
                val b1 = scanner.nextBoolean()
                println("Valor 2 (true/false):")
                val b2 = scanner.nextBoolean()
                val res = if (opcao == 5) b1 && b2 else b1 || b2
                println("Resultado Booleano: $res")
            }

            7 -> {
                println("Valor (true/false):")
                val b = scanner.nextBoolean()
                println("Resultado Booleano: ${!b}")
            }

            8, 9 -> {
                println("Número:")
                val n = scanner.nextInt()
                println("Bits a deslocar:")
                val bits = scanner.nextInt()
                val res = if (opcao == 8) n shl bits else n shr bits
                println("Resultado Decimal: $res")
                println("Resultado Hex: ${Integer.toHexString(res).uppercase()}")
            }
            else -> println("Opção inválida!")
        }
    } catch (e: InputMismatchException) {
        println("Erro: Por favor, introduza um formato válido!")
    } catch (e: ArithmeticException) {
        println("Erro: ${e.message}")
    }
}

fun main() {
    calculadora()
}