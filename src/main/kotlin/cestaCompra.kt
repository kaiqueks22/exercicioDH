
class Item(
    var numberItem: Byte,
    var descricaoItem: String,
    var quantidadeUni: Int,
    var valorUni: Double
) {
    init {
        if (quantidadeUni <= 0) {
            quantidadeUni = 0
        }
    }
}

class Fatura {
    var valorTotal: Double = 0.00
    fun soma(){
        val listaItem = arrayListOf<Item>(
            Item(11, "Mouse com fio", 3, 10.5),
            Item(12, "Teclado com fio", 2, 14.9),
            Item(13, "Caixa de Som", 1, 16.9)
        )
        for (element in listaItem){
            if(element.quantidadeUni >= 1){
                println("""
                ***
                Descrição do Item: ${element.descricaoItem}, item: ${element.numberItem}.
                Quantidade: ${element.quantidadeUni}.
                Valor unitario: ${element.valorUni} | Sub Total: ${element.valorUni * element.quantidadeUni}.

            """.trimIndent())
            }
        }
        for (element in listaItem){
            valorTotal += (element.valorUni * element.quantidadeUni)
        }
        println("""
                Valor Total: ${valorTotal}.

                """.trimIndent())
    }
}
fun main(){
    println(Fatura().soma())
}
