import kotlin.math.ceil

fun main() {
    // Pendiente 1
    val x1 = 4f
    val y1 = 3f
    // Pendiente 2
    val x2 = -3f
    val y2 = -2f

    // La ecuación de la pendiente se obtiene por la siguiente expresión:


    // 1.- Expresarla la ecuación de la pendiente con operadores.
    //     1.1.- Resolver el valor de la pendiente, tomando en cuenta que: P1(4,3), P2(-3,-2)
    val m = (y2 - y1) / (x2 - x1)
    println("La pendiente es: $m")

    // 2.- Del ejercicio anterior, responder: ¿Por qué el resultado obtenido difiere del resultado esperado?
    //     R= Porque esta tomando las variables como un tipo de dato entero, lo que tendriamos que especificar que tipo de dato es y cambiarlo a float.

    // 3.- Encontrar una solución para que se refleje el resultado.
    val m2 = (y2 - y1) / (x2 - x1)
    println("La pendiente con numero decimal es: $m2")
}