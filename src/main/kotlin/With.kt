fun main() {

    // Ver facilmente los valores de una variable
    val listaFrutas = listOf("Manzana","Pera","Mango")
    with(listaFrutas) {
        println("La lista de frutas es: $this")
        println("El total de frutas es: $size")
    }
}