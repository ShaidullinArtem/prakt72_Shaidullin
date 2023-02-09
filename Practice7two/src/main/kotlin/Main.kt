import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
//        println("Введите a:")
//        val a: Int = readln().toInt();
//
//        println("Введите b:")
//        val b: Int = readln().toInt();
//
//        println("Введите c:")
//        val c: Int = readln().toInt();
//
//        println(task10(a, b, c));

//        println("Введите a:")
//        val a: Int = readln().toInt();
//
//        println(task20(a))


//        println("Введите a:")
//        val a: Int = readln().toInt();
//
//        println("Введите b:")
//        val b: Int = readln().toInt();
//
//        println("Введите c:")
//        val c: Int = readln().toInt();
//
//        println("Введите d:")
//        val d: Int = readln().toInt();
//
//        println("Введите e:")
//        val e: Int = readln().toInt();
//
//        println("Введите f:")
//        val f: Int = readln().toInt();
//
//        task30(a, b, c, d, e, f);

        println("Введите a:")
        val a: Double = readln().toDouble();

        println("Введите b:")
        val b: Double = readln().toDouble();

        println("Введите c:")
        val c: Double = readln().toDouble();

        println("Введите u:")
        val u: Double = readln().toDouble();

        println("Введите v:")
        val v: Double = readln().toDouble();

        println(task41(a, b, c, u, v));

    } catch (e: NumberFormatException) {
        println("Вводимые данные дложны быть числами!")
        System.exit(1);
    }
}