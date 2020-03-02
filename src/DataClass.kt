data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args : Array<String>){
    val book:Book = Book("Desarrollo Movil Kotlin","Google Inc",10)
    println("Titulo del Libro "+book.name)
    println("Editorial "+book.publisher)
    println("Calificacion del Libro ${book.reviewScore}")
    println("Datos Generales del Libro "+book.toString())
    println("Ejemplo de HashCode "+ book.hashCode())
}