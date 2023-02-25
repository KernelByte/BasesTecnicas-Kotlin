fun main() {
    val listaCelulares = mutableListOf("Sony","Motorola","Xiaomi").apply { removeIf{valor -> valor.contains("Xiaomi")} }
    println(listaCelulares)
}