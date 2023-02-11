package com.projetolanchonete

class Pedido(var pratos: List<Prato>) {
    fun totalPedido(): Double {
        var soma = 0.0
        for (prato in pratos) {
            soma += prato.preco
        }
        return soma
    }
}