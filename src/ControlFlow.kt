fun main(args: Array<String>) {
    val a:Int = 5
    //contantes
    val b:Int = 2
    println("El Valor de a es "+a)
    println("El valor de b es "+b)
    var max: Int
    //variables
    // If - Else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("El Maximo de a o b es " +max)

    // As expression
    // val max = if (a > b) a else b
    // Use of When
    val x:Int = 5
    when (x) {
        1 -> println("x = = 1")
        2 -> println("x = = 2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    val y:Int = 5
    when (y) {
        1,2 -> println(" Value of X either 1,2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    //For Loop
    val items = listOf(1, 2, 3, 4)
    for (i in items){
        println("valor del array "+i)
    }

    val itemsDos = listOf(1, 22, 83, 4)

    for ((index, value) in itemsDos.withIndex()) {
        println("El elemento $index es igual a $value")
    }
    //While Loop and Do-While Loop
    var z:Int = 0
    println("Example of While Loop--")

    while(z <= 10) {
        println(z)
        z++
    }

    var v:Int = 0
    do {
        v = v + 10
        println("I am inside Do block---"+v)
    } while(v <= 50)

    //Use of Return, Break, Continue
    var u:Int = 10
    println("El Valor de X is--"+doubleMe(u))

    println("Example of Break and Continue")
    myLabel@ for(x in 1..10) { // appling the custom label
        if(x == 5) {
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel //specifing the label
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
    }

}
fun doubleMe(x:Int):Int {
    return 2*x;
}