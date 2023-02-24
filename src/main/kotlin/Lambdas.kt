fun main() {
    println(longitudValor("Hola mundo"))

    // Lista de paises
    val listaPaises = listOf("Colombia","Venezuela","Argentina")
    // Convertimos la lista de paises con map usando la lanbda como parametro y se convierte en un entero el retorno
    val longitudPaises = listaPaises.map (longitudValor)
    println(longitudPaises)
}


// Funcion lanbda personalizada
val longitudValor : (String) -> Int = {
        valor -> valor.length
}
