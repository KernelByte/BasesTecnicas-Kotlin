fun main() {
    val valor1 = longitudNombre(nombre = "Mozart",{ valor -> valor.length })
    println(valor1)

    val valor2 = superLambda("Yoniher Melendez")
    println(valor2())

}

// uso de lambda como parametro
fun longitudNombre (nombre : String, block : (String) -> Int) : Int{
    return block(nombre)
}


//Uso de lambda como retorno
fun superLambda (nombre : String) : () -> String {
    return {"El nombre es: $nombre"}
}