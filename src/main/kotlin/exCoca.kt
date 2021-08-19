class Coca(var tamanho: Double, var preco: Double)

class Validacao(var optionA: Any){
    override fun equals(other: Any?): Boolean {
        if (optionA == other) return true

        return false
    }
    override fun toString(): String{
        return optionA.toString()
    }
    override fun hashCode(): Int {
        return optionA.hashCode()
    }
}
fun main(){
    val cocaA = Coca(5.50, 6.00)
    val cocaB = Coca(5.50, 8.00)

    println("Equals: " + Validacao(cocaA).equals(cocaB))

    println("Equals do Tamanho:" + Validacao(cocaA.tamanho).equals(cocaB.tamanho))

    println(
        "toString:" + Validacao(cocaA.tamanho).toString()
        +" Preço:"+ cocaA.preco +" hashCode:"+ Validar(cocaA.tamanho).hashCode()
    )
    println(
        "toString:" + Validacao(cocaB.tamanho).toString()
        +" Preço:"+ cocaB.preco +" hashCode:"+ Validar(cocaB.tamanho).hashCode()
    )

    println(
        Validacao(
            cocaA.tamanho.toString()
            + cocaA.preco
            + cocaA.tamanho.hashCode()
        ).equals(
            cocaB.tamanho.toString()
            + cocaB.preco
            + cocaB.tamanho.hashCode()
        )
    )
}