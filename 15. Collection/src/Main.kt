fun main(args: Array<String>) {

    // ARRAY
      // fixed-size
      // mutable

    // COLLECTION
      // immutable (read-only collection) / tidak bisa diubah
      // mutable / bisa diubah
      // ada tiga jenis, setiap collection punya dua jenis (mutable dan immutable):
        // List
        // Map
        // Set

    // LIST
    // diurutkan berdasarkan nomor index
    // isinya boleh kembar / duplicate
    // banyak methodnya kok, liat aja di dokumentasi ya

        // READ-ONLY
        // tidak bisa memodifikasi langsung isinya
        println("READ-ONLY LIST")
        val members = listOf<String>("Tony", "Steve", "Banner")
        val members2: List<String> = listOf("Tony", "Steve", "Steve")

        val members3: List<String>
        members3 = listOf("Tony", "Steve", "Banner")

        // bisa juga gak pake tipe datanya
        val members4 = listOf("Tony", "Steve", "Banner")

        // tipe data dalam satu list bisa campur
        val members5 = listOf<Any>("Tony", "Steve", "Banner", 99)

        println(members.toList())
        println(members[0])
        println(members2.toList())
        println(members3.toList())
        println(members4.toList())
        println(members5.toList())

        // MUTABLE
        // isinya bisa dimodifikasi
        println("\nMUTABLE LIST")
        val members6 = mutableListOf<String>("Tony", "Steve", "Banner")
        members6.add("Peter")
        println(members6.toList())

        val members7 = mutableListOf<Any>("Tony", "Steve", "Banner", 99)
        println(members7.toList())

        // ada yg mirip
        // perbedaannya ada di return type
        val members8 = arrayListOf<String>("Tony", "Steve", "Banner")
        println(members8)
}