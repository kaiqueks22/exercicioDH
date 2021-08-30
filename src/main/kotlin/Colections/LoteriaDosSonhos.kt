package Colections

fun printar(){
    var numerosDaLoteria = mapOf(
        "key1" to "Ovos",
        "key2" to "Água",
        "key3" to "Escopeta",
        "key4" to "Cavalo",
        "key5" to "Dentista",
        "key6" to "Fogo",
    )
    for ((chave, valor) in numerosDaLoteria){
        println("chave: ${chave} Valor: ${valor}")
    }
}

fun main(){
    printar()
}