fun main(args: Array<String>) {

    // FOR
    for (i in 1..5) {
        println("baris ke $i")
    }

    print("\n")

    var avengers = arrayOf("Iron Man", "Captain America", "Thor", "Shield Agent", "Hulk", "Shield Agent")

    for (hero in avengers) {
        println("Calling heroes ...")
        if (hero != "Shield Agent") println("$hero answered")
    }

    print("\n")

    // CONTINUE
    for (hero in avengers) {

        if (hero == "Shield Agent") {
            // meneruskan looping dan tidak mengeksekusi syntax di bawahnya
            continue
        }

        println("Calling heroes ...")
        println("$hero answered")
    }
}