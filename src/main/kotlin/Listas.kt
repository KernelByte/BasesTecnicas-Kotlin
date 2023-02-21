fun main() {

    // Lista inmutable
    val listaNombres = listOf<String>("Oscar","Mario","Luisa")
    println(listaNombres)

    // Lista mutable
    val listaVacia = mutableListOf<String>()
    listaVacia.add("Ramiro")
    listaVacia.add("Luisa")

    //Obtencion de datos
    println(listaVacia[0])
    println(listaVacia.get(1))
}