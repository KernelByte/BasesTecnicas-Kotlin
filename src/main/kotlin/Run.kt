fun main() {
    val listaMoviles = mutableListOf("Sony","Xiaomi","Motorola")

        // Realizar operaciones sobre una lista antes de utilizarla
        .run {
            removeIf { movil -> movil.contains("Sony") }
            this
        }
    println(listaMoviles)
}