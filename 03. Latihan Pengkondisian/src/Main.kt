fun main(args: Array<String>) {

    // cek di mana superhero ini belong to

    val marvel = arrayOf("iron man", "captain america", "thor")
    val dc = arrayOf("superman", "batman", "the flash")
    val bumiLangit = arrayOf("gundala", "godam", "sri asih")

    print("Masukan nama karakter: ")
    val hero = readLine()
    val karakter = hero?.toLowerCase()

    if (karakter in marvel) {
        println("Avengers")
    } else if (karakter in dc) {
        println("Justice League")
    } else {
        println("Patriot")
    }
}