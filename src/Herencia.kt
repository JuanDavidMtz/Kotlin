
open class ABC {
    fun think () {
        println("Hola!! realizando metodo heredado ")
    }
}

class BCD: ABC(){ // inheritence happend using default constructor
}
fun main(args : Array<String>){
    var a = BCD()
    a.think()

    var b = GHI()
    b.think()
}

open class DEF(){
    open fun think(){
        println("hola")
    }
}

class GHI : DEF() {
    override fun think() {
        println("otro mensaje")
    }
}
