import java.util.*

class Pessoa(var nome: String, var rg: Long)

class Validar(var personA: Any) {

    // função para validar se 1º pessoa é igual a 2º
    override fun equals(other: Any?): Boolean {
        if (personA == other) return true

        return false
    }
}

fun main() {
    var pessoaA = Pessoa("kaique", 5214565884545)
    var pessoaB = Pessoa("Jonatas", 5214565884545)

    // validação de Pessoa e RG
    println(Validar(pessoaA.rg).equals(pessoaB.rg)) // TRUE

    // retornando um toString() e o hashCode()
    println(pessoaA.nome.toString() +" "+ pessoaA.rg +" "+ pessoaA.rg.hashCode())
    println(pessoaB.nome.toString() +" "+ pessoaB.rg +" "+ pessoaB.rg.hashCode())

    // comparndo se eles são iguais!
    println(
        pessoaA.nome.toString() + pessoaA.rg + pessoaA.rg.hashCode()
        ==
        pessoaB.nome.toString() + pessoaB.rg + pessoaB.rg.hashCode()
    )
    println(
        Validar(
            pessoaA.nome.toString() + pessoaA.rg + pessoaA.rg.hashCode()
        ).equals(
            pessoaB.nome.toString() + pessoaB.rg + pessoaB.rg.hashCode()
        )
    ) // Retorna FALSE
}