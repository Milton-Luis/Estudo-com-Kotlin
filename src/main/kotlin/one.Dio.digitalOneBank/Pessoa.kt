package one.Dio.digitalOneBank

class Pessoa{
    var nome: String = "Milton"
    var cpf:String = "187.452.098-02"

    inner class Endereco(){
        var rua:String = "Rua Alameda dos Anjos - 762"
    }
}

fun main(){
    val pessoa = Pessoa()
    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.Endereco().rua)
}