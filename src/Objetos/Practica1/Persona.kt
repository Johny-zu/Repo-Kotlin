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

    fun genero(){
        when(sexo){
            'm' -> println("Masculino")
            'f' -> println("Feminino")
            else -> println("Error")
        }
    }

    override fun toString(): String {
        var s : String = ""
        s += "El nombre completo es: $nombre $apellido"
        s += "Tiene: $edad de edad"
        s += "sexo: ${genero()}"
        return s
    }
}