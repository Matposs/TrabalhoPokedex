package br.com.up.pokedex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.R
import br.com.up.pokedex.model.Move

class MoveAdapter (private val movimentos: List<Move>) : RecyclerView.Adapter<MoveAdapter.MovimentoViewHolder>(){

    inner class MovimentoViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MoveAdapter.MovimentoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val layout = layoutInflater.inflate(
            R.layout.moves_view,
            parent,
            false
        )

        return MovimentoViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MovimentoViewHolder, position: Int) {

        val moves = movimentos[position]

        val nome_moves : TextView = holder.itemView.findViewById(R.id.movimento)

        nome_moves.setText(moves.move.name)

    }

    override fun getItemCount(): Int {
        return movimentos.size
    }
}