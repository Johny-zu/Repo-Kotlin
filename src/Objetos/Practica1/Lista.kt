package Objetos.Practica1

fun main() {
    val menu = "1.- Ingresa personas " +
            "\n2.- Lista de personas " +
            "\n3.- " +
            "\n5.- Salida"
    var opcion : Int
    var listaPersonas = mutableListOf<Persona>()

    do {
        print("$menu \nIngresa una opcion: ")
        opcion = readLine()!!.toInt()
        when(opcion)
        {
            1 -> {
                println("¿Cuántos datos quieres ingresar?")
                var n = readLine()!!.toInt()
                for (i in 1..n) {
                    print("Ingresa nombre: ")
                    var nombre = readLine()!!.toString()
                    print("Ingresa los apellidos: ")
                    var apellido = readLine()!!.toString()
                    print("Ingresa la edad: ")
                    var edad = readLine()!!.toInt()
                    print("Ingresa género: m(Masculino) o f(Femenino): ")
                    var sexo = readLine()!!.toCharArray()[0]

                    var persona = Persona(nombre, apellido, edad, sexo)
                    listaPersonas.add(persona)
                }
            }
            2 -> {
                if (listaPersonas.isEmpty())
                    println("No hay datos en la lista")
                else {
                    println("Las personas dentro son: ")
                    for (Persona in listaPersonas)
                        println(Persona.toString())
                }
            }
            3 -> {
                println("Ingresa el numero de la persona que se va: ")
                var index = readLine()!!.toInt()
            }

            else -> "Error"
        }
    } while (opcion != 5)
}