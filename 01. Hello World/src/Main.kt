fun main(args: Array<String>) {
    println("Hello World")
    hello();

    // val dan var
    // var bisa diubah nilainya
    // val tidak bisa diubah

    val nama = "Anugrah Ramadhan"
    val sex = "laki-laki"
    println("Hallo saya " + nama + ". Saya seorang " + sex)

    var pekerjaan = "tukang ledeng"
    var umur = 29
    println("Saya bekerja sebagai " + pekerjaan + ". Umur saya " + umur + " tahun.")

    // nama = "Anugrah Al-Khwarizmi" --> tidak bisa di-reassigned
    // begitu juga dengan sex

    pekerjaan = "programmer"
    umur = 30
    println("Saya bekerja sebagai " + pekerjaan + ". Umur saya " + umur + " tahun.")

    // penulisan variable biasanya memakai camel case
    var tempatTanggalLahir = "California, 9 Februari 1990"
    println(tempatTanggalLahir)
    // atau menggunakan underscore _
    var makanan_favorit = "indomie"
    println(makanan_favorit)

    // kagak boleh nomer di awal nama
    // var 2HariKemarinNgapain = "tidur"

    // bisa juga ditulis spesifik dengan tipe datanya
    val angka: Int = 20
    println(angka)
    val kata: String = "hei mantan"
    println(kata)
    val angkaString: String = "30"
    println("ini dibaca sebagai string: " + angkaString)

    // bisa ngambil nilai seuatu variabel dengan begini
    val kataLanjutan = "$kata, kamu goblog deh"
    println(kataLanjutan)
    // mengetahui panjang string
    println(kataLanjutan.length)
    // capitalize
    println(kataLanjutan.capitalize())
    // dan masih banyaaaak lagi. liat dokumentasi kotlinnya aja ya

    // TIPE DATA
    // double, float, long, int, short, byte
    println("\n===================")
    println("TIPE DATA DI KOTLIN")
    println("===================")
    val angkaDouble: Double = 2.0
    println("ini adalah Double: " + angkaDouble)
    val angkaFloat: Float = 1.34F
    println("ini adalah Float: " + angkaFloat)
    val angkaLong: Long = 1000000000000000L
    println("ini adalah Long: " + angkaLong)
    val angkaInt: Int = 1000000000
    println("ini adalah Int: " + angkaInt)
    val angkaShort: Short = 10000
    println("ini adalah Short: " + angkaShort)
    val angkaByte: Byte = 100
    println("ini adalah Byte: " + angkaByte)

    // jika string ditambahkan dengan bukan string, hasilnya akan string
    var hasil: String = angkaString + angka
    println(hasil)
    // kalau bukan string duluan, maka akan eror
    // atau bisa diconvert jadi int
    var hasil2 = angkaString.toInt() + angka
    println(hasil2)

    // tipe data char
    // yg satu karakter doang tea gening
    // pake kutip satu ya
    // char + string bisa ditambahin, hasilnya jadi string
    // string + char bisa ditambahin, hasilnya jadi string
    val data = '5';
    val data1 = 'c';
    println(data + "" + data1)

    // ARRAY
    println("\n=====")
    println("ARRAY")
    println("=====")

    var mantan = arrayOf("Cania", "Vania", "Karina")
    println(mantan.toList())
    println(mantan[0])
    mantan[0] = "Sonia"
    println(mantan[0])
    mantan.set(1, "Putri")
    println(mantan.toList())

    // Array kumpulan integer
    var nums = intArrayOf(23,567,76)
    println(nums.toList())
    println("angka max = " + nums.max())
    println("angka min = " + nums.min())
    println("nilai rata-rata = " + nums.average())
    println("nilai pertama = " + nums.first())
    println("nilai terakhir = " + nums.last())
    println("banyaknya nilai = " + nums.count())
    // itu semua juga bisa diaplikasikan ke:
    // byte, long, double, byte --> tipeDataArrayOf
    // ada juga buat char dan boolean


}

fun hello() {
    println("hello mantan")
}
