fun main(args: Array<String>) {

    val jenisKelamin = "perempuan"
    val penis = "tidak ada"

    // tidak sama dengan / negasi !=

    if (jenisKelamin != "laki-laki") {
        println("bukan jantan")
    } else {
        println("jantan")
    }

    // OR ||
    if (jenisKelamin != "laki-laki" || jenisKelamin == "perempuan") {
        println("bukan jantan")
    } else {
        println("jantan")
    }

    // AND &&
    if (jenisKelamin != "laki-laki" && penis == "tidak ada") {
        println("bukan jantan")
    } else {
        println("jantan")
    }
}