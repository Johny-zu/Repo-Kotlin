package Bases

fun main() {
    val d : Int
    val check = true

    if (check)
        d = 1
    else
        d = 2

    println(d)

    //De esta forma se puede hacer un equalsTo
    val obj = "Hola"
    when (obj){
        "1" -> println("Uno")
        "Hola" -> println("Adios")
    else -> println("Ni idea")
    }

    val orden = "Comanda"
    val result = when (orden){
        "Equivocado" -> "Simon"
        "Comanda" -> "Saliendo!"
    else -> "En espera"
    }

    println(result)

    val temp = 25
    val desc = when {
        temp < 0 -> "hace frio"
        temp >0 && temp < 20 -> "Esta fresco"
        temp > 20 && temp < 30-> "Esta caliente"
    else -> "Hace calor"
    }
    println(desc)
}