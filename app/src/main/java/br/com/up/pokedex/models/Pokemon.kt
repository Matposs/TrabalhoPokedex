package br.com.up.pokedex.models

data class Pokemon(
    var name: String,
    var url: String,
    var abilities:List<PokeAbility>?,
    var move:List<Move>?,
    var stat:List<Stat>?,
    var type:List<Type>
)
