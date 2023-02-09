import kotlin.math.abs

fun task20(a: Int) {
    println("y1 = ${1- abs(a)}")
    println("y2 = ${a - abs(a)}")
    val r: Double = abs(1/9 - Math.pow(a.toDouble(), 2.0) * (-1) * Math.pow(a.toDouble(), 2.0))
    println("y3 = ${Math.sqrt(Math.pow(r, 2.0) - Math.pow(a.toDouble(), 2.0))}")
}
