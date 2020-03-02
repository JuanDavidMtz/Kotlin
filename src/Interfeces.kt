
interface EjemploDeInterfaces  {
    var myVar: Int            // abstract property
    fun absMethod():String    // abstract method

    fun hello() {
        println("Hello there, Welcome to TutorialsPoint.Com!")
    }
}
class IntefacesImplementacion : EjemploDeInterfaces{
    override var myVar: Int = 26
    override fun absMethod(): String = "Mensaje variable abstracta"
}

interface A{
    fun printTo(){
        println("Interfece A")
    }
}
interface B : A{
    fun printInterfaceB(){
        println("Interface B")
    }
}
class  multipleInterface : A,B

fun main(args: Array<String>){
    val obj = IntefacesImplementacion()
    println("Valor de la variable ${obj.myVar}")
    println("Llamando Metodo hello")
    obj.hello()

    println("Mensaje del metodo abstracto")
    println(obj.absMethod())

    val objeto = multipleInterface()
    objeto.printTo()
    objeto.printInterfaceB()
}