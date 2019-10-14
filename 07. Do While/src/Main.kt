fun main(args: Array<String>) {

    // program menjumlahkan angka, selama angka != 0, maka akan dijumlahkan semuanya
    var input = ""
    var total = 0

    println("Masukan 0 jika sudah selesai memasukan semua angka")

    do {
        print("Masukan angka: ")
        // !! = non null
        input = readLine()!!
        total = total + input.toInt()
    } while (input != "0")

    println("total = $total")
}