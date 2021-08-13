package classes.classes

class Item(
    var numberItem: Int,
    var descricaoItem: String,
    var quatidadeUni: Int,
    var valorUni: Int){
}

class Fatura(){
    fun calcular(){

    }
}
/**class Aluno(
var nomeAluno: String = "",
var registro: Int = 0,
var sobrenome: String = ""
) {
fun assistirAula() {
println("Aluno $nomeAluno+$sobrenome está presente!")
}

fun licaoDeCasa() {
println("Tem lição de casa!")
}
}

class Professor(
var nomeProf: String = "",
var registro: Int = 0
) {

fun lecionar(aula: Aula, curso: Curso) {
println(
"""
Professor $nomeProf está ONLINE!
Com a ${aula.materia} que se inicia as ${aula.inicio} até ás ${aula.termino}
Do Curso: ${curso.nomeCurso}, da Turma: ${curso.nomeTurma}.
""".trimIndent()
)
}
}

class Aula() {
var materia: String = ""
var inicio: String = ""
var termino: String = ""
//val listaAlunos: List<>
}

class Curso() {
var nomeCurso: String = ""
var nomeTurma: String = ""
}*/
