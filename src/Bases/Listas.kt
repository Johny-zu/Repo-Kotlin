package Bases

fun main() {
    //Listas
    var frutas = listOf("Manzana", "Platano", "Kiwi")
    println(frutas) //Lista de lectura

    val verduras : MutableList<String> = mutableListOf("Col", "Nabo", "Apio")
    println(verduras)

    verduras.add("Brocoli") //Asi se llega a usar el mutableList

    println("El primer elemento es: ${frutas.first()}") //De esta manera se muestra el primer elemento
    println("El primer elemento es: ${frutas.last()}") //De esta otra vemos el ultimo

    println("La segunda lista tiene: ${verduras.count()}")

    val formas = setOf("rombo", "tringulo", "circulo")
    val otraFormas : MutableSet<String> = mutableSetOf("cuadrado", "pentagono", "estrella")

    otraFormas.addAll(formas)
    println(otraFormas)

    otraFormas.remove("pentagono")

    println(otraFormas)
}