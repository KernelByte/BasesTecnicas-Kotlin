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

    val numerosLoteria = listOf<Int>(1,2,46,78,53,89)

    // Ordenar lista de manera ascendente
    numerosLoteria.sorted();
    println(numerosLoteria)

    // Orden desendente
    val numeroDesendentes =  numerosLoteria.sortedDescending()
    println(numeroDesendentes)

    // Ordenar lista con una condicion
    numerosLoteria.sortedBy { numeros -> numeros < 30 }
    println(numerosLoteria)

    // Orden reversiva
    val numerosLoteriaReverse = numerosLoteria.reversed()
    println(numerosLoteriaReverse)

    // Convertir lista de enteros a cadena de texto con map mediante programacion funcional
    val listanumeros2 = listOf(10,20,30,40,50)
    val listaConversion = listanumeros2.map { numeros -> "El numero es: $numeros" }
    println(listaConversion)

    val numerosFiltrados = listanumeros2.filter { numeros -> numeros < 30 }
    println(numerosFiltrados)

}