fun main(args: Array<String>) {
    val numbers = listOf(1,10,100,1000)
    val text = listOf("Andi", "Dodi", "Budi")

    // FILTER
    // menyaring beberapa list sesuai yang dimau
    val lessThan50 = numbers.filter { it < 50 }
    println("Filter: " + lessThan50.toList())

    // MAP
    // mentransformasi nilai
    val doubled = numbers.map { x -> x * 2 }
    println("Map: " + doubled.toList())

    // ANY
    // return true jika salah satunya benar
    val result = text.any { it.contains("And") }
    if (result) println("Any: benar") else println("Any: salah")
    val hasil = numbers.any { it == 10 }
    if (hasil) println("Any: benar") else println("Any: salah")

    // ALL
    // return true jika semuanya benar
    val result2 = text.all { it.contains("di") }
    if (result2) println("All: benar") else println("All: salah")
    val hasil2 = numbers.all { it % 1 == 0 }
    if (hasil2) println("All: benar") else println("All: salah")

    // NONE
    // return true jika semuanya salah
    val result3 = text.none { it.contains("anjing") }
    if (result3) println("None: benar") else println("None: salah")
    val hasil3 = numbers.none { it + 1 == 1 }
    if (hasil3) println("None: benar") else println("None: salah")

    // FIND
    val words = listOf("aku", "lagi", "stress", "nih", "anjing", "anjay")
    val word = words.find { it.startsWith("an") }
    val word2 = words.findLast { it.startsWith("an") }
    println(word)
    println(word2)
}