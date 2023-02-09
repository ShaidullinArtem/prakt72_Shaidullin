
// Очень затратный, но нестандартный вариант))
fun task30(a: Int, b: Int, c: Int, d:Int, e: Int, f: Int) {
    for (x in -100..100) {
        for (y in -100..100) {
            if (a * x + b * y == c && d * x + e * y == f) {
                println("x = $x, y = $y")
                break;
            }
        }
    }
}