fun main(args: Array<String>) {
    // bosen hello world mulu
    println ("halo mantan")

    // bosen array angka mulu
    val mantan = arrayOf("Cania, Sonia, Karina")
    println ("List mantan : " + mantan.toList())

    // BOOLEAN
    println("\n=======")
    println("BOOLEAN")
    println("=======")

    val isInLove = false

    // standar lah ini mah sama kayak bahasa program yang laen
    // operasinya juga sama
    // ==, !=
    // &&, ||
    // !
    // <,>,<=,>=

    // IF ELSE
    if (isInLove) {
        println("make love")
    } else {
        println("be emo")
    }

    print("Berapa uang kamu: ")
    val uang = Integer.valueOf(readLine())
    print("Berapa utang kamu: ")
    val utang = Integer.valueOf(readLine())
    var pernyataan: String

    if (uang >= 50000) {
        pernyataan = "kamu kaya raya"
    } else {
        pernyataan = "kamu miskin"
    }
    println(pernyataan)

    // bisa juga gini
    if (uang >= 50000) pernyataan = "lebih dari sama dengan 50000"
    else pernyataan = "kurang dari 50000"
    println(pernyataan)

    // IF ELSE IF
    if (uang > utang) {
        pernyataan = "bisa bayar utang dong bos"
    } else if (uang == utang) {
        pernyataan = "pas-pasan banget bos"
    } else {
        pernyataan = "cari duit dong bos, biar bisa bayar utang"
    }
    println(pernyataan)
}