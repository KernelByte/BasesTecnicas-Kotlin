fun main() {

    // Probar una variable si esta nula o no
    var prueba : String? = null
    prueba?.let {
        valor -> println("El valor de la variable es: $prueba")
    }

    prueba = "2023"
    prueba.let {
            valor -> println("El valor de la variable es: $prueba")
    }
}
