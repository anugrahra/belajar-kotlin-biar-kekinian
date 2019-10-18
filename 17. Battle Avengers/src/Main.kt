var avengers = mutableMapOf<String, Int>(
    "iron man" to 100,
    "thor" to 500,
    "hulk" to 300,
    "captain america" to 70
)

fun main(args: Array<String>) {
    // addNewAvenger(nama avenger, power)
    addNewAvenger("hawkeye", 15)

    // upgradePower(avenger, power default 10)
    upgradePower("thor", 500)

    // battle(avenger1, avenger2)
        // remove jika kalah
    battle("captain america", "hawkeye")
    upgradePower("hulk", 100)
    battle("hulk", "captain america")

    println(avengers.toList())
}

fun addNewAvenger(name: String, power: Int = 5) {
    avengers.put(name, power)
    println("$name berhasil dipanggil")
}

fun upgradePower(name: String, power: Int) {
    val newPower = avengers[name]!! + power
    avengers.replace(name, newPower)
    println("Power $name berhasil diupgrade menjadi $newPower")
}

fun battle(avenger1: String, avenger2: String) {
    val ave1 = avengers[avenger1]!!
    val ave2 = avengers[avenger2]!!

    if (ave1 > ave2) {
        println("$avenger1 menang")
        avengers.remove(avenger2)
    } else if (ave1 == ave2) {
        println("$avenger1 dan $avenger2 sama kuat")
    } else {
        println("$avenger2 menang")
        avengers.remove(avenger1)
    }
}