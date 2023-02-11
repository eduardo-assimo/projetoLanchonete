package com.projetolanchonete

class Cardapio {
    val cardapio: Set<Prato> = setOf()

    fun listar() {
        cardapio.map{println(it)}
    }
    fun adicionarPrato(prato: Prato) : Boolean {
        val newCardapio = cardapio.toMutableSet()
        return newCardapio.add(prato)
    }
    fun removerPrato(prato: Prato) : Boolean {
        val newCardapio = cardapio.toMutableSet()
        return newCardapio.remove(prato)
    }
}