fun main() {
    var nombre = "Maria Juliana"

    if (nombre == "Maria"){
        println("Se cumplio la condicion")
    }
    else if (nombre == "Mario") {
        println("El nombre es: $nombre")
    }
    else{
        println("No se cumplio la condicion, el nombre ingresado es $nombre y su longitud es de: ${nombre.length} caracteres")
    }
}