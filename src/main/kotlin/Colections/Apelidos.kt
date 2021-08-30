package Colections

fun apelidos(){
    var dicionario = mapOf(
        "Joâo" to "Juan, El Divo, Maromba, Zé Bonitinho",
        "Miguel" to "Dark Knight, Bruce Wayne, Batfleck, Gengiva",
        "Maria" to "Ju, Mary, Marilene, Ventania",
        "Lucas" to "Lukinha, Jorge, George, Kevin Flynn",
    )
    for ((chave, valor) in dicionario){
        println("Amigo: ${chave}  Apelido: ${valor}")
    }
}

fun main(){
    apelidos()
}