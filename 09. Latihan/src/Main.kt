fun main(args: Array<String>) {
    // 1. Jumlahkan ada berapa Gold dan ada berapa silver
    val treasures = arrayOf("Gold", "Gold", "Silver",
                            "Silver", "ZONK", "Silver",
                            "ZONK", "Gold", "Silver")

    println("DENGAN FOR + IF ELSE IF")
    var totalGold = 0;
    var totalSilver = 0;

    for (minerals in treasures) {
        if (minerals == "Gold") {
            totalGold += 1 // totalGold = totalGold + 1
        } else if (minerals == "Silver") {
            totalSilver += 1
        }
    }
    println("Total Gold = $totalGold")
    println("Total Silver = $totalSilver")

    // atau bisa memakai WHEN
    println("\nDENGAN FOR + WHEN")
    var totalGold2 = 0;
    var totalSilver2 = 0;

    for (minerals in treasures) {
        when (minerals) {
            "Gold" -> totalGold2++ // cuman plus 1 mah bisa diginiin
            "Silver" -> totalSilver2++
        }
    }
    println("Total Gold = $totalGold2")
    println("Total Silver = $totalSilver2")

    print("\n")

    // 2.1 menerima input salah satu nama
    // 2.2 tentukan alien atau bukan
    // 2.3 tentukan asalnya

    val heroEarth = arrayOf("iron man", "captain america", "hulk")
    val heroGod = arrayOf("thor", "valkyrie", "odin")
    val heroSpace = arrayOf("rocket", "captain marvel", "groot")

    // PseudoCode = kode bayangan

    // terima input dari user
    print("Masukan nama: ")
    val nama = readLine()?.toLowerCase()

    println("\nDENGAN IF ELSE + WHEN")
    // menguji apakah ada di heroEarth atau tidak
    if (nama in heroEarth) {
        println("${nama?.capitalize()} bukan alien")
    } else {
        println("${nama?.capitalize()} adalah alien")
    }

    // tentukan asalnya
    when (nama) {
        in heroEarth -> println("Berasal dari Bumi")
        in heroGod -> println("Berasal dari Asgard")
        in heroSpace -> println("Berasal dari Luar Angkasa")
        else -> println("Tidak ada di database kami")
    }

    // ATAU bisa juga begini
    println("\nHANYA WHEN")
    when (nama) {
        in heroEarth -> {
            println("${nama?.capitalize()} bukan alien")
            println("Berasal dari Bumi")
        }
        in heroGod -> {
            println("${nama?.capitalize()} adalah alien")
            println("Berasal dari Asgard")
        }
        in heroSpace -> {
            println("${nama?.capitalize()} adalah alien")
            println("Berasal dari Luar Angkasa")
        }
        else -> println("${nama?.capitalize()} tidak ada di database kami")
    }
}