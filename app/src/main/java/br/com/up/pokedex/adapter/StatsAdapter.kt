package br.com.up.pokedex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.R
import br.com.up.pokedex.model.Stat

class StatsAdapter (private val estatisticas: List<Stat>) : RecyclerView.Adapter<StatsAdapter.EstatisticaViewHolder>(){

    inner class EstatisticaViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): StatsAdapter.EstatisticaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val layout = layoutInflater.inflate(
            R.layout.status_view,
            parent,
            false
        )

        return EstatisticaViewHolder(layout)
    }

    override fun onBindViewHolder(holder: EstatisticaViewHolder, position: Int) {

        val status = estatisticas[position]

        val nome_status : TextView = holder.itemView.findViewById(R.id.nomeStatView)
        val valor_status : TextView = holder.itemView.findViewById(R.id.valueStat)

        nome_status.setText(status.stat.name)
        valor_status.setText(status.base_stat.toString())


    }

    override fun getItemCount(): Int {
        return estatisticas.size
    }
}