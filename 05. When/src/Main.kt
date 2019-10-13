fun main(args: Array<String>){

    print("masukan angka pertama: ")
    val a = Integer.valueOf(readLine())
    print("masukan angka kedua: ")
    val b = Integer.valueOf(readLine())

    print("masukan operasi: ")
    val operator = readLine()

    // IF ELSE IF
    val result =
        if(operator == "+") a + b
        else if (operator == "-") a - b
        else if (operator == "/") a / b
        else if (operator == "*") a * b
        else "ya tidak bisa dihitung dong"
    println("hitung: $a $operator $b = $result (else if)")

    // WHEN
    val result2 = when(operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "ya tidak bisa dihitung dong"
    }
    println("hitung: $a $operator $b = $result2 (when)")
}