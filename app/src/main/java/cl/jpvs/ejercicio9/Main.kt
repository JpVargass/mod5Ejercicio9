package cl.jpvs.ejercicio9

fun main() {

    println("Ingrese el valor")

    val input = readLine()!!.toDouble()

    val fahrenheit = ((9.0 / 5.0) * input) + 32

    println(fahrenheit)

    val kelvin = input +273.15

    println(kelvin)
    



}



fun isLetters(string: String): Boolean {
    return string.none { it !in 'A'..'Z' && it !in 'a'..'z' }
}
