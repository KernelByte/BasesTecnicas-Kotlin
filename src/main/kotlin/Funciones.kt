fun main() {
    //println("La suma de los numeros es: "+sumaDeNumeros(40,40))
    //imprimir()
    //println(ramdomCase("Hola mundo"))
    //println("Hola".imprimirMensaje())
    println(imprimirNombre(nombre = "Yoniher"))
}
/*
// Funcion que retorna valores
fun sumaDeNumeros(numero1: Int, numero2 : Int): Int {
    return numero1 + numero2
}

// Funcion que no retorna
fun imprimir(): Unit {
    println("Otra suma de numeros es: "+1+2)
}

//Funcion
fun ramdomCase(frase : String) : String{
    val numeros = 0..99
    val numeroAleatorio = numeros.random()

    return if (numeroAleatorio.rem(2) == 0)  frase.uppercase() else  frase.lowercase()
}


// Funciones de extencion
fun String.imprimirMensaje (): String {
    if (this.length > 10)
        return "mensaje mayor"
    else{
        return "mensaje menor"
    }
}*/

// Valores por defecto
fun imprimirNombre (nombre : String, apellido : String = "") : String{
    val resultado = "El nombre escrito es: $nombre $apellido"
    return resultado
}