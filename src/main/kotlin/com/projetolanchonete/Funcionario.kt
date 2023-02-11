package com.projetolanchonete

class Funcionario(nome: String, cpf: String, var cargo: String) : Pessoa(nome, cpf) {
    fun pegarPedido(pedido: Pedido){
        println("O pedido ${pedido.toString()} foi anotado.")
    }
    fun prepararPedido(pedido: Pedido) {
        println("O pedido ${pedido.toString()} está sendo preparado.")
    }
}