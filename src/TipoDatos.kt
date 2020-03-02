fun main(args: Array<String>) {
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Variable  Int equivale a  "+a);
    println("Variable  Double equivale a  "+d);
    println("Variable  Float equivale a"+f);
    println("Your Long Value is "+l);
    println("Your Short Value is "+s);
    println("Your Byte Value is "+b);

    val letter: Char    // defining a variable
    letter = 'A'        // Assigning a value to it
    println("$letter")

    val booleanLetter: Boolean   // defining a variable
    booleanLetter = true         // Assinging a value to it
    println("Your character value is "+"$booleanLetter")

    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\n"

    println("Hello!"+escapedString)
    println("Hey!!"+rawString)

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array Example "+numbers[2])
    println("Hey!! I am array Example "+numbers[0])
    println("Hey!! I am array Example "+numbers[4])

    val numbersDos: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
    val readOnlyView: List<Int> = numbersDos                  // immutable list
    println("Lista mutable--"+numbersDos)        // prints "[1, 2, 3]"
    numbersDos.add(4)
    println("lista mutable despues de insertar un valor --"+numbersDos)        // prints "[1, 2, 3, 4]"
    println(readOnlyView)

    val items = listOf(1, 2, 3, 4)
    println("Primer elemento de la lista----"+items.first())
    println("ultimo elemento de la lista----"+items.last())
    println("Numeros de la lista----"+items.filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are"+strings)


    val i:Int  = 2
    for (j in 1..4)
        println(j) // prints "1234"

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("Hemos encontrado tu numero --"+i)
    }

}