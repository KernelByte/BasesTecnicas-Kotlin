fun main() {
    val edadMaestros = mapOf("Luis" to 25, "Mario" to 30, "Marta" to 56)
    println(edadMaestros)

    // Coleccion Map muteable
    val edadMaestrosMuteable = mutableMapOf("Luis" to 25, "Mario" to 30, "Marta" to 56)
    edadMaestrosMuteable.put("Oscar", 89)
    println(edadMaestrosMuteable)

    edadMaestrosMuteable.remove("Luis")
    println(edadMaestrosMuteable)

    //Imprimir todos los valores
    println(edadMaestros.keys)
    println(edadMaestros.values)
}