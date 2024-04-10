package Objetos.Practica1

fun main() {
    val menu = "1.- Ingresa personas " +
            "\n2.- Lista de personas " +
            "\n3.- Ver cierta persona" +
            "\n4.- Quitar una persona" +
            "\n5.- Edad promedio" +
            "\n6.- Mayores de edad" +
            "\n7-. Cuantos hombres y mujeres" +
            "\n8.- Salida"
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
                if(listaPersonas.isEmpty())
                    println("No hay datos en la lista")
                else{
                    println("Ingresa el numero de la persona que se va: ")
                    var index = readLine()!!.toInt()
                    if (index >= 0 && index < listaPersonas.size)
                        println("Buscabanas a la persona: " + listaPersonas[index].toString())
                }
            }
            4 -> { if (listaPersonas.isEmpty())
                    println("No hay datos en la lista")
                else {
                    println("Ingresa una persona a eliminar: ")
                    var index = readLine()!!.toInt()
                    if (index >= 0 && index < listaPersonas.size) {
                        val borrada = listaPersonas.removeAt(index)
                        println("Persona eliminada: ")
                        println(borrada.toString())
                    } else
                        println("No hay tal persona")
                }
            }
            5 -> {
                if (listaPersonas.isEmpty())
                    println("No hay datos en la lista")
                else {
                    var prom : Double = 0.0
                    var suma : Int = 0
                    for (Persona in listaPersonas){
                        suma += Persona.edad
                    }
                    prom = suma.toDouble()/listaPersonas.size
                    println("La edad promedio es: $prom")
                }
            }
            6 -> {
                if (listaPersonas.isEmpty())
                    println("No hay datos en la lista")
                else {
                    var mayor = false
                    println("Personas mayores de edad: ")
                    for (Persona in listaPersonas) {
                        if (Persona.edad >= 18) {
                            println(Persona.toString())
                            mayor = true
                        }
                    }
                    if (!mayor)
                        println("No hay personas mayores de edad")
                }
            }
            7 -> {
                if (listaPersonas.isEmpty())
                    println("No hay datos en la lista")
                else {
                    var nh = 0 //numero de hombres
                    var nm = 0 //numero de mujeres
                    var errores = 0
                    for (Persona in listaPersonas) {
                        if (Persona.sexo == 'm')
                            nh++
                        else if (Persona.sexo == 'f')
                            nm++
                        else
                            errores++
                    }
                    println("Hay $nh hombres")
                    println("Hay $nm mujeres")
                    if (errores > 0)
                        println("Se equivocaron $errores veces")
                }
            }

            8 -> println("Saliendo...")
            else -> "Error"
        }
    } while (opcion != 8)
}