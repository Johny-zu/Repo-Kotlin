package Bases

fun externa(){
    print("Comienzo de funciones\n")
}

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun muestraMensaje(mensaje : String, prefijos : String = "Info"){
    println("[$prefijos] $mensaje")
}

//Ejercicio uno
fun areaCirculo(r : Double) : Double{
    val pi = 3.1416;
    val resultado = Math.pow(r, 2.0) * pi
    return resultado
}

fun main() {
    externa()
    println(suma(10, 20))

    muestraMensaje("Hola", "log") //De esta manera tomamos ciertos valores
    muestraMensaje("Hola") //Mostrar solo un parametro
    muestraMensaje(prefijos = "nuevo", mensaje = "Mensaje")

    println(areaCirculo(3.0))
}