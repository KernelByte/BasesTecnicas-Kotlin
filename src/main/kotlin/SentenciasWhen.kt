fun main() {
    var nombreColor = "Morado";

    when(nombreColor){
        "Amarillo" -> println("El color es el: $nombreColor")
        "Rojo","Naranja" -> println("El color es el: $nombreColor")
        "Azul" -> println("El color es el: $nombreColor")
        "Verde" -> println("El color es el: $nombreColor")
        "Negro" -> println("El color es el: $nombreColor")
        else ->  println("El color no esta en la lista de opciones el color es el: $nombreColor")
    }

    // Uso de la sentencia in
    var code = 410
    when(code){
        in 200..290 -> println("Exelente todo!")
        in 400..500 -> println("Muy mal todo!")
    }
    // Asignacion del WHEN
    val tallaZapatos = 45

    val mensaje = when(tallaZapatos){
        41,43 -> println("Tenemos disponibles")
        42,44 -> println("Ya casi no nos quedan")
        else -> println("Esa talla no esta disponible")
    }
    println(mensaje)
}