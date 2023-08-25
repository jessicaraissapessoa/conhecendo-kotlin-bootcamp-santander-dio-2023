package introducao

class Customer //Declaração de classe

class  Contact(val id: Int, var email: String) //Classe com construtor (parâmetros)

fun main() {

    val customer = Customer() //Criação de instância da classe Customer, que só tem casca
    val contact = Contact(1, "mary@gmail.com")

    println(contact.id) //contact.id -> propriedade id da classe contact
    println(contact.email)
    contact.email = "jane@gmail.com" //reatribuição do valor da propriedade var email da classe contact
    println(contact.email)

}