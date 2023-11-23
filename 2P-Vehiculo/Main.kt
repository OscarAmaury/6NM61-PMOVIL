fun main() {
    //Companion Objects

    val vehiculoInstance = Vehiculo.create()
    var saludo = { println("Hola UPIICSA") }()

    //Funciones literales

    val suma = {a: Int, b: Int -> a + b}
    println(suma(1,2))
    val presentarse: (String,Int) -> String = {name,age -> "Me llamo $name y tengo $age años"}
    println(presentarse("Oscar", 21))

    val saverGrade: (Double,Double) -> String = {expected: Double, saved: Double ->
        val percentage = saved /expected

        when {
            percentage > 1 -> "Ahorrador Pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade(150.0,100.0))

    //Expresiones anónimas

    val saverGrade2 = fun(expected:Double, saved:Double): String{
        val percentage = saved /expected
        return when{
            percentage > 1 -> "Ahorrador Pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade2(100.0,80.0))
}