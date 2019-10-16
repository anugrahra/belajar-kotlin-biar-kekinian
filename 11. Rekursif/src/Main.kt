import com.sun.jdi.LongValue

fun main(args: Array<String>) {
    // REKURSIF
    // fungsi yang memanggil dirinya sendiri

    // faktorial N
    // 10 -> 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
    // 5 -> 5 * 4 * 3 * 2 * 1
    println("FAKTORIAL")
    println("=========")
    print("masukan nomor (1-20): ")
    val nomor = readLine()
    val result = nomor?.toLong()?.let { factorial(it) }
    println("Hasil faktorial $nomor adalah $result")
}

fun factorial(num: Long): Long {
    return if (num == 1L)
        num
    else if (num == 0L)
        1
    else
        num * factorial(num-1)
}