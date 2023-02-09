

fun task10(a: Int, b: Int, c:Int): String {
    val progressArr: IntArray = intArrayOf(a, b, c);
    progressArr.sort()
    return if (progressArr[progressArr.lastIndex] - progressArr[0] == progressArr[1]) "Да" else "Нет";
}