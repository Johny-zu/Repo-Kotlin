package Objetos.Practica1

class Persona {
    var nombre: String = ""
    var apellido: String = ""
    var edad: Int = 0
    var sexo: Char = '@'

    constructor(nombre: String, apellido: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
        this.sexo = sexo
    }

    fun genero(): String {
        return when (sexo) {
            'm' -> "Masculino"
            'f' -> "Femenino"
            else -> "Error"
        }
    }

    override fun toString(): String {
        var s: String = ""
        s += "El nombre completo es: $nombre $apellido\n"
        s += "Tiene: $edad de edad\n"
        s += "Es: ${genero()}\n" // Llamada a la función genero() sin concatenación
        return s
    }
}