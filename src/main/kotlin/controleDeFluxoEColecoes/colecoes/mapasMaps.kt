package controleDeFluxoEColecoes.colecoes

//Constante imutável -> quantidade de pontos ganhos por viagem
const val POINTS_X_PASS: Int = 15

//Map com contas dos usuários e seus respectivos pontos. Mutável -> Pode mudar a quantidade de pontos do usuário
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

//Ready-only (cópia de somente leitura) para relatório do map anterior
val EZPassReport: Map<Int, Int> = EZPassAccounts

//Função para update de pontos: recebe id da conta. Se a conta possuir o id, atualiza. Senão, não adiciona
//O id precisa estar no map. Caso contrário, cai no else
fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...") //Informação de que está atualizando
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS //pontos da conta = atuais + pontos ganhos
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId") //Mensagem de erro. Conta não existe
    }
}

//Função que reporta/imprime relatório percorrendo o map da versão read-only do mutable map. id e seus pontos
fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach{
        (k, v) -> println("ID $k: credit $v") //k -> id / v -> créditos do usuário do respectivo id
    }
}

fun main() {

    accountsReport() //Relatório
    updatePointsCredit(1) //Update nos pontos do usuário de id 1
    updatePointsCredit(1) //Outro update nos pontos do usuário de id 1
    updatePointsCredit(5) //Update nos pontos do usuário de id 5. Dá erro, pois não há cadastro desse usuário
    accountsReport() //Relatório atualizado após os updates (2 updates na conta de id 1)

}