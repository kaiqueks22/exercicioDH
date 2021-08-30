
abstract class Produto(val nome: String, val preco: Double)

class CarrinhoDeCompras(){
    var listaDeProduto = ArrayList<Produto>()
    fun addProduto(produto: Produto){
        listaDeProduto.add(produto)
    }
}
class caixa(){
    fun fechamentoDeConta(){

    }
}