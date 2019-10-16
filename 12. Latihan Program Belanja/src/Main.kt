fun main(args: Array<String>) {

    val uang = 13000
    val total = belanja("monitor") + belanja("mouse") + belanja("keyboard")
    bayar(uang, total)

    val uang2 = 10000
    val totalArray = belanjaArray(arrayOf("monitor", "mouse", "keyboard"))
    bayar(uang2, totalArray)
}

fun belanja(item: String): Int {
    return when(item) {
        "monitor" -> 5000
        "mouse" -> 1000
        "keyboard" -> 2500
        else -> 0
    }
}

fun belanjaArray(items: Array<String>): Int {
    var totalBelanja = 0
    for (item in items) {
        when (item) {
            "monitor" -> totalBelanja += 5000
            "mouse" -> totalBelanja += 1000
            "keyboard" -> totalBelanja += 2500
            else -> totalBelanja += 0
        }
    }
    return totalBelanja
}

fun bayar(uang: Int, total: Int) {
    val hasil = uang - total
    if(uang >= total) {
        println("Uangnya cukup, kembaliannya = $hasil")
    } else {
        println("Sori bos, uangnya gak cukup")
    }

}