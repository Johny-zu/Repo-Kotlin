package Bases

fun main() {
    //Bucle for corriente
    for(numero in 1..4) {
         println(numero)
     }

    //For con lista
    val pasteles = listOf("Chocolate", "Vainilla", "Queso")
    for(pastel in pasteles){
        println("Deliciosos pasteles de $pastel!")
    }

    //While corriente
    var lotePasteles = 0
    while (lotePasteles < 3){
        println("comiendo pastel")
        lotePasteles++
    }

    //do while
    var lostePastel = 0;
    var stockPastel = 3
    do {
        println("Vendiendo")
        stockPastel++
    } while (stockPastel < lostePastel)
}