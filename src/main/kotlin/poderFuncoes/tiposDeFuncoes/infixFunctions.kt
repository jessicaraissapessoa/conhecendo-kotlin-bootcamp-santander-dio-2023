package poderFuncoes.tiposDeFuncoes

fun main() {

    /*
    - infinx function aplicada ao tipo Int com definição de times quando receber uma String (str) como parâmetro
    - Quando acionada, pega a String recebida em str e repete a quantidade de vezes informada (times)
    - No println da linha seguinte, imprime "Bye " recebido em str 2 vezes (times)
     */
    infix fun Int.times (str: String) = str.repeat(this)
    println(2 times "Bye ") //Imprime: Bye Bye


    /*
    - infix function pair -> nativa do Kotlin
    - conecta um valor a outro com o to, criando um par em uma estrutura de dados pair
     */
    val pair = "Ferrari" to "Katrina"
    println(pair) //Imprime: (Ferrari, Katrina)


    /*
    - Outra forma de representar um par -> onto
    - String.onto recebe uma String em other
    - Em sequência, Pair(this, other) recebe a primeira String de other mais outra em other conectada pelo onto
    - Em myPair, o onto conecta as duas Strings recebidas em other
    - No println, imprime o par
     */
    infix fun String.onto (other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair) //Imprime: (McLaren, Lucas)


    /*
    - Instâncias da classe Person3 (classe presente mais abaixo, fora da main)
    - Instâncias: sophia, claudia, fulano, jessie, greg, juh, patreze
     */
    val sophia = Person3("Sophia") //Instância de Person3
    val claudia = Person3("Claudia") //Instância de Person3
    val fulano = Person3("Fulano") //Instância de Person3
    val jessie = Person3("Jessie") //Instância de Person3
    val greg = Person3("Greg") //Instância de Person3
    val juh = Person3("Juh") //Instância de Person3
    val patreze = Person3("Patreze") //Instância de Person3


    //Implementações chamando infix function likes
    sophia likes claudia //chamando infix function likes. Adiciona claudia na lista likedPeople de sophia
    sophia likes fulano //chamando infix function likes. Adiciona fulano na lista likedPeople de sophia
    sophia likes greg //chamando infix function likes. Adiciona greg na lista likedPeople de sophia
    jessie likes greg //chamando infix function likes. Adiciona greg na lista likedPeople de jessie
    jessie likes juh //chamando infix function likes. Adiciona juh na lista likedPeople de jessie
    jessie likes patreze //chamando infix function likes. Adiciona patreze na lista likedPeople de jessie


    //Percorrendo e exibindo a mutableList likedPeople das instâncias sophia e jessie de Person3
    sophia.printLikedPeople() //Imprime -> liked people of Sophia: Claudia, Fulano, Greg
    jessie.printLikedPeople() //Imprime -> liked people of Jessie: Greg, Juh, Patreze

}


/*
- 1. Classe Person3 recebe String em name -> Exemplo "Sophia"
- 2. A classe possui uma mutableList likedPeople -> mutableList de pessoas (instâncias de Person3) de quem a Person3 passada em name gosta
- 3. Infix function likes recebe as pessoas (instâncias de Person3) de quem Person3 passada em name gosta e adiciona na mutableList likedPeople
- 4. Função para percorrer elementos (likedPerson) da likedPeople e imprimí-los (FUNÇÃO EXTRA QUE IMPLEMENTEI)
- 5. Voltar para "Instâncias da classe Person3..." para seguir para aplicações da classe na main
- Ver aplicação em "Aplicação likedPeople" no final do código da main
 */
class Person3 (val name: String) { //1

    val likedPeople = mutableListOf<Person3>() //2

    infix fun likes (other: Person3){ //3
        likedPeople.add(other)
    }

    fun printLikedPeople() { //4 (IMPLEMENTAÇÃO EXTRA - NÃO ESTÁ NA AULA)

        print("liked people of $name: ")

        for (likedPerson in likedPeople) { //para cada pessoa (likePerson) de quem Person3 passada em name gosta (likedPeople)...

            if (likedPerson == likedPeople.last()) { //Se for o último elemento de likedPeople...
                println(likedPerson.name) //imprime nome da pessoa
            } else { //Se não for o último elemento de likedPeople...
                print(likedPerson.name + ", ") //imprime nome da pessoa seguindo de vírgula e espaço
            }
        }
    }

}