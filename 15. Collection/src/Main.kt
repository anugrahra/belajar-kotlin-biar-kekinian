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

    // SET
    // isinya harus unique (gak boleh kembar)

        // READ-ONLY
        println("\nREAD-ONLY SET")
        val members9 = setOf<String>("Tony", "Steve", "Banner", "Peter")
        println(members9.toList())
        val members10 = setOf<String>("Tony", "Steve", "Banner", "Tony")
        // Tony nya bakal hanya ada satu doang
        println(members10.toList())

        // MUTABLE
        println("\nMUTABLE SET")
        val members11 = mutableSetOf<String>("Tony", "Steve", "Banner", "Peter")
        members11.add("Natasha")
        println(members.toList())

    // MAP
    // mengurutkannya berdasarkan key dan value -> list[key]

        // READ-ONLY
        // <tipeDataKey, tipeDataValue>
        // key to value
        println("\nREAD-ONLY MAP")
        val members12 = mapOf<Int, String>(0 to "Tony", 1 to "Steve", 2 to "Banner", 3 to "Peter")

        println(members12[2])

        for(key in members12.keys) {
                println(members12[key])
        }

        members12.forEach {
               (key, value) -> println("key: $key, value: $value")
        }

        // MUTABLE
        println("\nMUTABLE MAP")
        val members13 = mutableMapOf<Int, String>(0 to "Tony", 1 to "Steve", 2 to "Banner", 3 to "Peter")
        members13.put(4, "Natasha")
        members13[5] = "Rhodey"

        members13.forEach {
                        (key, value) -> println("key: $key, value: $value")
        }
}