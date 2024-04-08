package Bases

fun mayusculas(palabra : String) : String {
    return palabra.uppercase()
}

fun tiempoMinutos(tiempo : String) : (Int) -> Int = when(tiempo) {
    "horas" -> {value -> value * 60 * 60}
    "minutos" -> {value -> value * 60}
    "segundos" -> {value -> value}
    else -> {value -> value}
    }

fun main() {
    println(mayusculas("mayusculas")) //Las muestra en mayusculas

    val mayusculas = {palabra : String -> palabra.uppercase() }
    println(mayusculas("nueva palabra"))

    //Otra funcion de lambda es
    val numeros = listOf(1, -2, 3, -4, 5, -6)
    val positivos = numeros.filter { x -> x > 0 }
    val negativos = numeros.filter { x -> x < 0 }

    println(positivos)
    println(negativos)

    val nuevosNumeros = listOf(1, -2, -4, -5, -6)
    val dobles = nuevosNumeros.map { x -> x * 2 }
    val triples = nuevosNumeros.map { x -> x * 3 }

    println(dobles)
    println(triples)

    val tiempoMinutos = listOf(2, 10, 15, 1)
    val min2sec = tiempoMinutos("minutos")
    val horafinal = tiempoMinutos.map(min2sec).sum()
    println("La hora es: $horafinal")
}