import java.lang.Exception

fun main() {
    var nombre : String? = null

    try {
        throw NullPointerException("Ha ocurrido un error mayor")
        //nombre?.length
    }catch (execepcion : NullPointerException){
        println("Ah ocurrido un error por valor nulo")
    } finally {
        println("Ah ocurrido un error ... Cerrando la aplicacion")
    }

    var primerValor = 10
    var segundoValor = 0

    try {
        var resultado = primerValor/segundoValor
    }catch (excepcion : Exception){
        println("No se puede dividir por cero")
    }

}