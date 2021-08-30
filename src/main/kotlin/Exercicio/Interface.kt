// import kotlin.test.*

interface Imprimivel {
    var nome: String
    var tipoDeDocumento: String
    fun imprimir(): String {
        return "Eu sou"
    }
}

class Foto(
    override var nome: String,
    override var tipoDeDocumento: String
) : Imprimivel {
    override fun imprimir(): String {
        return "${super.imprimir()} uma $tipoDeDocumento, $nome."
    }
}

class Documento(
    override var nome: String,
    override var tipoDeDocumento: String
) : Imprimivel {
    override fun imprimir(): String {
        return "${super.imprimir()} um $tipoDeDocumento, $nome."
    }
}

class Contrato(
    override var nome: String,
    override var tipoDeDocumento: String
) : Imprimivel {
    override fun imprimir(): String {
        return "${super.imprimir()} um $tipoDeDocumento, $nome."
    }
}

class Impressora {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun imprimirLista(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)

        for (item in listaImprimivel) {
            println(
                """
            ${imprimivel.imprimir()}
            """.trimIndent()
            )
        }
    }
}

fun main() {
    val foto = Foto("selfie", "foto")
    val documento = Documento("RG", "documento")
    val contrato = Contrato("contrato de trabalho", "contrato")

    Impressora().imprimirLista(foto)
    Impressora().imprimirLista(documento)
    Impressora().imprimirLista(contrato)
}
