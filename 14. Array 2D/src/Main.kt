fun main(args: Array<String>) {
    // 2D Array

    val seats = arrayOf(
                        intArrayOf(0, 10, 100),
                        intArrayOf(2, 20, 200),
                        intArrayOf(3, 30, 300)
                )

    println(seats[2][2])
    print("\n")

    for (row in seats) {
        for (column in row) {
            println("$column")
        }
    }

    print("\n")

    // mengganti value
    seats [0][0] = 1000
    println(seats[0][0])
}