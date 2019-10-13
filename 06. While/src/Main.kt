fun main(args: Array<String>) {

    var i = 1

    while (i <= 10){
        println("halo mantan " + i++)
    }

    print("\n")

    // print angka genap diantara angka 1 - 20

    var j = 1

    while (j <= 10) {
        val angka = j * 2
        println(angka)
        j++
    }

    print("\n")

    // print angka genap diantara angka 1 - 20

    var k = 1

    while (k*2 <= 20) {
        val angka = k * 2
        println(angka)
        k++
    }

    print("\n")

    // print angka ganjil diantara angka 1 - 20

    var l = 1

    while (l <= 20) {
        println(l++)
        l++
    }
}