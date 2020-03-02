
class myClass {
    // property (data member)
    private var name: String = "Tutorials.point"

    // member function
    fun printMe() {
        println("You are at the best Learning website Named-"+name)
    }
}
class Outer {
    class Nested {
        fun foo() = "Welcome to The TutorialsPoint.com"
    }
}
class OuterMore {
    private val welcomeMessage: String = "Inner Class Welcome to the TutorialsPoint.com"
    inner class NestedDos{
        fun foo() = welcomeMessage
    }
}

interface Human {
    fun think()
}

fun main(args: Array<String>) {
    val obj = myClass() // create obj object of myClass class
    obj.printMe()
    val demo = Outer.Nested().foo() // calling nested class method
    println(demo)

    val demoDos = OuterMore().NestedDos().foo()
    println(demoDos)

    var programmer :Human = object:Human{
    override fun think(){
        println("hola")
    }
    }
    programmer.think()
}