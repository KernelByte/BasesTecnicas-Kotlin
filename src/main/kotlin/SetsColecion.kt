fun main() {
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i")
    println(vocalesRepetidas)

    val numerosRepetidosmutables = mutableSetOf(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9)
    println(numerosRepetidosmutables)
    numerosRepetidosmutables.add(10)
    println(numerosRepetidosmutables)
    numerosRepetidosmutables.remove(1)
    println(numerosRepetidosmutables)

    // Set con condicion
    val valorObtenido = numerosRepetidosmutables.firstOrNull{numero -> numero == 10}
    println(valorObtenido)
}