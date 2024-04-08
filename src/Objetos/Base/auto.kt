package Objetos.Base

class auto {
    var color = ""
    var modelo = 0
    var marca = ""

    constructor(color:String, modelo:Int, marca:String){
        this.color = color
        this.modelo = modelo
        this.marca = marca
    }

    override fun toString() : String{
        var s : String = ""
        s += "el color del carro es: $color\n"
        s += "el modelo del carro es: $modelo\n"
        s += "el marca del carro es: $marca\n"
        return s
    }

    fun enciende(){
        println("enciende el auto")
    }

    fun acelera(){
        println("El auto acelero 10km/hr")
    }

    fun freno(){
        println("El auto freno")
    }
}