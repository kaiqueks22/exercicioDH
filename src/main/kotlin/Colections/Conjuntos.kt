package Colections

/* Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos ao
conjunto vazio: 1,5,5,6,7,8,8,8. Imprimir o resultado na tela. Qual é a diferença entre este
exercício e o anterior?*/

var adicionaNumero = listOf<Int>(1, 5, 5, 6, 7, 8, 8, 8)

fun adiciona(){
    var lista = mutableListOf<Int>()
    for (item in adicionaNumero){
        lista.add(item)
        println(lista)
    }
}

fun main(){

    adiciona()

}