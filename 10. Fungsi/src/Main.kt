// fungsi main itu wajib ya
fun main(args: Array<String>) {
    // FUNCTION

    val color = "merah"
    val color2 = "biru"

    gambarSegitiga()
    warnaSegitiga(color)
    warnaSegitiga(color2)
    println("segitiga berhasil dibuat")

    println("\nCALCULATOR")
    val nomor1 = 10
    val nomor2 = 20

    add(nomor1, nomor2)

    val hasil = add2(nomor1, nomor2)
    println("hasil dari penjumlahan 2: $hasil")

    val hasil2 = hasil * 3
    println("hasil dari penjumlahan dikalikan tiga: $hasil2")

    val hasil3 = multiply(nomor1, nomor2)
    println("hasil dari perkalian: $hasil3")
    printHasil(hasil3)

    createCharacter("Pikachu", 100)
    createCharacter("Bulbasaur")
    createCharacter()
    // createCharacter(200) -> eror
    createCharacter(power = 200)
}
               // namaParam: tipeData
fun warnaSegitiga(color: String) {
    println("mewarnai dengan $color")
}

fun gambarSegitiga() {
    println("gambar garis satu")
    println("gambar garis dua")
    println("gambar garis tiga")
}

fun add(num1: Int, num2: Int) {
    val sum = num1 + num2
    println("Hasil dari penjumlahan 1: $sum")
}
                                    // tipeData yang akan di kembalikan (return)
fun add2(num1: Int, num2: Int): Int {
    val sum = num1 + num2
    return sum
}

fun multiply(num1: Int, num2: Int): Int {
    return num1 * num2
}

// VOID / fungsi yang tidak mengembalikan nilai
// ini sebenernya return unit (yang ga perlu ditulis)
fun printHasil(result: Int)/*: Unit*/{
    println("calculate berhasil dijalankan = $result")
}
                                 // nilai default       // nilai default
fun createCharacter(name: String = "Unnamed", power: Int = 50) {
    println("$name mempunyai power sebesar $power")
}