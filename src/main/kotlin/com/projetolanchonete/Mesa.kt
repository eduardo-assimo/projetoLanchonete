package com.projetolanchonete

class Mesa {
    val idMesa: Int

    companion object{
        var numMesa: Int = 0
    }
    init {
        numMesa++
        idMesa = numMesa
    }
    var clientes: MutableSet<Cliente> = mutableSetOf()
    var pedidos: MutableList<Pedido> = mutableListOf()

    fun verificaDisponibilidade() : Boolean {
        return clientes.isEmpty()
    }

    fun addPedidos(pedido: Pedido) : Boolean {
        return pedidos.add(pedido)
    }

    fun addCliente(cliente: Cliente) : Boolean {
        if (cliente.mesa.idMesa == idMesa) {
            return clientes.add(cliente)
        }
        return false
    }

    fun fecharComanda(): Double {
        var soma = 0.0
        for (pedido in pedidos) {
            soma += pedido.totalPedido()
        }
        liberarMesa()
        return soma
    }
    private fun liberarMesa() {
        pedidos = mutableListOf()
        clientes = mutableSetOf()
    }
}