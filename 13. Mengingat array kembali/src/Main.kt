fun main(args: Array<String>) {
    val heroes = arrayOf<String>("Iron Man", "Captain America", "Hulk", "Thor")
    val numbers = intArrayOf(4,6,3,48,5,56,7)

    for (hero in heroes)
        println(hero)

    for (index in 0..numbers.size - 1)
        println(numbers[index])

    // indices teh index yang tersedia langsung
    for (index in numbers.indices)
        println("indices " + numbers[index])

    print("\n")

    // inisialisasi array kosong
    val numbers2 = Array<Int>(3){0}
    // memasukan nilai ke index
    numbers2[0] = 45
    numbers2[1] = 2
    numbers2[2] = 190

    for (num in numbers2) {
        println(num)
    }
}