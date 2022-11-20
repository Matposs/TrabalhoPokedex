package br.com.up.pokedex

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.up.pokedex.adapters.PokeAdapter
import br.com.up.pokedex.network.PokeApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {


    private val lv: ListView? = null
    private val editText: EditText? = null
    private val adapter: ArrayAdapter<String>? = null


    companion object {
        fun getRetrofitInstance(path: String) : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
    }

    fun ObterDados () {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerPokemon : RecyclerView =
            findViewById(R.id.recycler_pokemon)

        recyclerPokemon.layoutManager =
            GridLayoutManager(this, 3)

        PokeApi().pokemons { pokemons ->

            if(pokemons != null){
                recyclerPokemon.adapter =
                    PokeAdapter(pokemons){ pokemon ->



                    }
            }
            else{
                // TODO implements error
            }
        }
    }
}