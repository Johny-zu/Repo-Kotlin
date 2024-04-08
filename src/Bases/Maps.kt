package Bases

fun main() {
    val menuJugos = mapOf("Manzana" to 50, "Naranja" to 40) //Forma de declararla
    println(menuJugos) //La mostramos

    var nuevoMenu : MutableMap<String,Int> = mutableMapOf("Limon" to 40, "kiwi" to 50, "Sandia" to 60)
    println(nuevoMenu) //Lo mostramos

    //Mostrar los numeros de elementos
    println("Este menu tiene ${nuevoMenu.count()} elementos")

    //Para quitar o poner en el mutable
    nuevoMenu.put("Coco", 50)
    println(nuevoMenu)
    nuevoMenu.remove("Naranja")
    println(nuevoMenu)

    //Para saber si hay una en especifico se puede
    println(nuevoMenu.containsKey("Limon"))

    //Para obtener una coleccione de claves de un mapa
    println(nuevoMenu.keys) //solo texto
    println(nuevoMenu.values) //Solo precio
}