package one.Dio.digitalOneBank

class Pessoa{
    var nome: String = "Milton"
    var cpf:String = "187.452.098-02"
    private set //permite a visibilidade porém em nenhum outra instancia ele poderá ser alterado

    constructor()

    fun pessoaInfo() = "Nome: $nome" + ", CPF: $cpf"  //interpolação
}

fun main(){
    val pessoa = Pessoa()
    // println(pessoa.nome)
    // println(pessoa.cpf)

    println(pessoa.pessoaInfo())
}