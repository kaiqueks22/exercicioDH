import java.util.*

abstract class Ingresso() {
    open var valor: Float = 10.00f
    open fun imprimeValor(): Float {
        return valor
    }
}

class IngressoVip() : Ingresso() {
    var valorAdd: Float = 10.00f
    override fun imprimeValor(): Float {
        return valorAdd + valor
    }
}

class IngressoPadrao() : Ingresso() {
    override fun imprimeValor(): Float {
        return valor
    }
}

fun escolha() {
    val scanner = Scanner(System.`in`)
    println("Qual o ingresso desejado?")
    println(
        """
        1 - Ingresso VIP
        2 - Ingresso Padrão
    """.trimIndent()
    )
    var retorno = scanner.nextInt()
    when (retorno) {
        1 -> println("Ingresso Vip")
        2 -> println("Ingresso Padrão")
        else -> println(
            """
            OPÇÃO INVALIDA
            Por favor tente novamente!
        """.trimIndent()
        )
    }
}

fun main() {

    println(
        """
        Ingresso VIP
        Valor: R$${IngressoVip().imprimeValor()}
        
        Ingresso Padrão
        Valor: R$${IngressoPadrao().imprimeValor()}
        
    """.trimIndent()
    )
    escolha()
}