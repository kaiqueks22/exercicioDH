import java.util.*

fun main() {
    game()
}

fun game() {
    val scanner = Scanner(System.`in`)
    println("Olá meu jovem, gostaria de iniciar?")
    println(
        """
        1 - sim
        2 - não
    """.trimIndent()
    )
    var retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        println("Boa!")
    } else {
        println("Sem tempo irmão!")
    }

}