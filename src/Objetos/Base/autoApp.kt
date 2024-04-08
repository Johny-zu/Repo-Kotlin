package Objetos.Base

fun main() {
    var menu = "1.- solo un auto \n2.- Lista de autos \n3.- Ingresa un auto \n4.- Ver todos los carros\n5.- Salida"
    var op : Int
    var listaAutos = mutableListOf<auto>()

    do{
        print("$menu \nIngresa una opcion: ")
        op = readLine()!!.toInt()
        when(op)
        {
            1 -> {
                val auto = auto("rojo", 5, "Nisan")
                println(auto.toString())
            }
            2-> {
                var listaAutos = arrayOf<auto>() //puede almacenar conjuntos de objetos
                val auto1 = auto("verde", 2, "toyota")
                val auto2 = auto("negro", 3, "Chevrolet")
                val auto3 = auto("azul", 1, "Kia")
                listaAutos = arrayOf(auto1, auto2, auto3)
                for (auto in listaAutos) {
                    println(auto.toString())
                }
            }
            3 -> {
                println("Ingresa los datos del auto: ")
                print("Color: ")
                var color = readLine()!!.toString()
                print("Modelo: : ")
                var modelo = readLine()!!.toInt()
                print("Marca: ")
                var marca = readLine()!!.toString()

                var auto = auto(color, modelo, marca)
                listaAutos.add(auto)
            }
            4 -> {
                if(listaAutos.isEmpty())
                    println("Lista vacia")
                else{
                    println("Los autos son: ")
                    for(auto in listaAutos)
                        println(auto.toString())
                }
            }
            5 -> println("Saliendo...")

            else -> println("Opcion no valida")
        }
    } while (op != 5)
}
