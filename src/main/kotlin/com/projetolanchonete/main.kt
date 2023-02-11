package com.projetolanchonete

fun main() {


    val arroz = Prato(nome = "arroz", descricao = "porção de 100g arroz branco", preco = 8.0)
    val feijoada = Prato(
        nome = "Feijoada", descricao = "Feijão Preto, Carne Seca PA, Carne Seca de Dianteiro, Lombo Suíno, " +
                "Costelinha Suína, Linguiça Calabresa, Bacon, Bucho, Chispe, Orelha, Rabinho e Temperos.", preco = 30.00
    )
    val coquinha = Prato(nome = "Coca-Cola", descricao = "Uma latinha de coca geladinha", preco = 5.00)
    val coxinhaDeFrango =
        Prato(nome = "Coxinha de Frango", descricao = "Coxinha de massa de batata com frango desfiado", preco = 8.00)
    val hamburguer =
        Prato(
            nome = "Hamburguer", descricao = "150g de carne bovina, pão brioche, queijo mussarela, maionese da casa " +
                    "e fritas.",
            preco =
            35.00
        )

    val cardapio = Cardapio()

    cardapio.adicionarPrato(arroz)
    cardapio.adicionarPrato(feijoada)
    cardapio.adicionarPrato(coquinha)
    cardapio.adicionarPrato(coxinhaDeFrango)
    cardapio.adicionarPrato(hamburguer)

    cardapio.listar()

    val funcionario1 = Funcionario(nome = "Guilherme", cpf = "123.456.789-10", cargo = "gerente")
    val funcionario2 = Funcionario(nome = "Rubens", cpf = "123.456.789-10", cargo = "garçon")


    val mesas = mutableListOf<Mesa>()
    for (i in 1..10) {
        mesas.add(Mesa())
    }

    val cliente1 = Cliente(nome = "Julia", cpf = "123.456.789-10", mesa = mesas[0])
    val cliente2 = Cliente(nome = "Gabriel", cpf = "123.456.789-10", mesa = mesas[1])

    val pedido1 = Pedido(listOf(arroz, feijoada))

    cliente1.mesa.addPedidos(pedido1)
    val valorComandaCliente1 = cliente1.mesa.fecharComanda()
    println(valorComandaCliente1)

    val lanchonete = Lanchonete(
        cardapio = cardapio,
        funcionarios = mutableListOf(funcionario1, funcionario2),
        mesas = mesas
    )
}