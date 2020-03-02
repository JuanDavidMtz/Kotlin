class Person(val firstName: String, var age: Int) {
    // class body
}
class HUman(val firstName: String, var age: Int) {
    val message:String  = "Hey!!!"
    constructor(name : String , age :Int ,message :String):this(name,age) {
    }
}
fun main(args: Array<String>) {
    val person1 = Person("TutorialsPoint.com", 15)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
    val human = HUman("Juan David",26,"Hola")
    println("${human.firstName}"+" ${human.age}"+" ${human.message}")
}
