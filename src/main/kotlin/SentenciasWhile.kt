fun main() {

    var constador = 0;
    while (constador < 10){
        constador++
        println("El contador es: $constador")
    }

    var segundoContador = 0;
    do {
        segundoContador++
        println("El segundo contador es: $segundoContador")
        if (segundoContador==20){
            constador = 1
        }

    }while(constador > 9)

    val listaDeFrutas = listOf("Manzana","pera","banano")

    for (fruta in listaDeFrutas){
        println("El listado de frutas es: $fruta")
    }

    listaDeFrutas.forEach { fruta -> println("El listado de frutas en el foreach es: $fruta") }

}