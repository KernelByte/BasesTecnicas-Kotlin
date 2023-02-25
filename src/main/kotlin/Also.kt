fun main() {
    // Sirve para depurar una variable aplicando diferentes funciones a la misma.
    val listaCelulares = listOf("Samsung","Nokia","Motorola","Huawei").also { lista -> "Mensaje de la lista es: $lista" }.reversed()
    println(listaCelulares)
}