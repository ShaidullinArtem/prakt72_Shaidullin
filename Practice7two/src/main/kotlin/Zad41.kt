import kotlin.math.sqrt

fun task41(a: Double, b: Double, c:Double, u: Double, v: Double): String {
    val d: Double = sqrt(Math.pow(b, 2.0) + 4 * a * c);
    val y1 = (-b + d) / 2 * a;
    val y2 = (-b -d) / 2 * a;

    if (y1 < v && y2 < u) return "Максимальная: $y1, Минимальная: $y2";
    if (y1 > v && y2 < u) return "Максимальная: $v, Минимальная: $y2";
    if (y1 > v && y2 > u) return "Максимальная: $v, Минимальная: $u";

    return "Максимальная: $y1, Минимальная: $u"
}