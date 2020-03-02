class Alien {
    var skills : String = "null"
    fun printMySkills() {
        println(skills)
    }
}

fun Alien.addMySkills(a:Alien):String{
    var a4 = Alien()
    a4.skills = this.skills + " " +a.skills
    return a4.skills
}

class Other {
    companion object {
        fun show():String {
            return("You are learning Kotlin from TutorialsPoint.com")
        }
    }
}

fun main(args : Array<String>){
    var objeto = Alien()
    objeto.skills = "KOTLIN"

    var  a2 = Alien()
    a2.skills = "SQL"
    //a2.printMySkills()

    var  a3 = Alien()
    a3.skills = objeto.addMySkills(a2)
    a3.printMySkills()

    println("Hola"+Other.show())
}