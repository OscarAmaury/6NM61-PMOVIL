    // Se declaran los 3 lados del triangulo.
    const val ladoA = 8
    const val ladoB = 6
    const val ladoC = 4

fun main() {
    // Mostrar a pantalla los valores de los lados.
    println("Longitudes de los baleros:")
    println("Lado A: $ladoA")
    println("Lado B: $ladoB")
    println("Lado C: $ladoC")

    // Verifica el tipo de triángulo.
    if (ladoA == ladoB && ladoB == ladoC) {
        println("El triángulo es equilátero.")
    } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
        println("El triángulo es isósceles.")
    } else {
        println("El triángulo es escaleno.")
    }
}