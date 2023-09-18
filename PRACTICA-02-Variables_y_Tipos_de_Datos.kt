const val PI = 3.1416
fun main() {
    //  La presente practica tiene como objetivo comprobar ciertos tipos de datos asignados por defecto.

    //  1.- Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo.
    val NumDecimal = 13.13
    println(NumDecimal)
    //      R= El tipo de dato que se asigna por defecto es el DOUBLE

    // 2.- Volver flotante a la variable decimal.
    val NumDecimal2 = 13.13f
    println(NumDecimal2)

    // 3.- Declarar una variable const val con el valor de PI y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro
    //     de un círculo.
    //          3.1.- Para multiplicar adelantaremos el uso del operador de multiplicación * y su uso es así: val c= a*b
    val p = 2 * PI * NumDecimal2

    // 4.- Para el ejemplo anterior, utilizar un String Template para imprimir el texto "El perímetro del círculo es: [resultado]" siendo
    // resultado nuestra variable perímetro.
    println("El perímetro del círculo es: $p")
}