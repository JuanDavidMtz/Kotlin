//PRIVATE
private class privateExample {
    private val i = 1
    private val doSomething  = "Mensaje Variable Privada"
}

open class classA() {
    protected val i = 8
}
class classB : classA() {
    fun getValue() : Int {
        return i
    }
}
//internal
class internalExample {
    internal val i = 9
    internal fun doSomething() {
    }
}
//public
class publicExample {
    val i = 10
    fun doSomething() {
    }
}
fun main(args : Array<String>){
    val publicClass = publicExample()
    println("Variable publica ${publicClass.i}")
    val internalClass = internalExample()
    println("Variable Interna ${internalClass.i}")
    val openClass = classB()
    println("Variable Abierta ${openClass.getValue()}")
    val privateClass = privateExample()
    println("Variable privada $privateClass.get")

}