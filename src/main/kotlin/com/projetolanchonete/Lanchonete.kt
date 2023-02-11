package com.projetolanchonete

data class Lanchonete (
    val cardapio: Cardapio,
    val funcionarios: MutableList<Funcionario>,
    val mesas: MutableList<Mesa>
)