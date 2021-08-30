package Colections;

fun main(){
    var numbers = mutableListOf<Int>()
    val numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 8, 8, 9, 7, 5, 4, 0)

    class numeral(){
        fun printar(){
            for (item in numbers){
                println(item)
            }
        }
    }

    numbers.addAll(numeros)
    numeral().printar()

}
