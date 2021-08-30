val soma:(Int, Int) -> String ={
    x: Int, y: Int ->
    val resultado = x + y
    "$x + $y = $resultado"
}
val subtrair:(Int, Int) -> String ={
    x: Int, y: Int ->
    val resultado = x - y
    "$x - $y = $resultado"
}
val mutiplicar:(Int, Int) -> String ={
        x: Int, y: Int ->
    val resultado = x * y
    "$x X $y = $resultado"
}
val dividir:(Int, Int) -> String ={
        x: Int, y: Int ->
    val resultado = x / y
    "$x / $y = $resultado"
}
val validacao:(String) -> Boolean ={
    it.contains("@")
    it.contains(".")
}
val recebeECalcula:(List<Int>) -> Unit ={
    for (item in it){
        var resultado: Int = 0
        resultado += (item + item)
        println(resultado)
    }

}
fun main(){
    println(soma(5,10))
    println(subtrair(10,5))
    println(mutiplicar(5,10))
    println(dividir(10, 5))

    val validando = validacao("kaique@hotmail.com")
    fun validaEmail(){
        if(validando){
            println("Tudo certo!")
        } else {
            println("Ops, algo deu errado!")
        }
    }
    validaEmail()

    val listanumeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    recebeECalcula(listanumeros)
}