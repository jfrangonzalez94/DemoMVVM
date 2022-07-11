package marena.gob.ni.demomvvm.UI.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.card_anime_search.view.*
import marena.gob.ni.demomvvm.Data.Model.AnimeResults
import marena.gob.ni.demomvvm.R

class AnimeListAdapter(val _Contexto: Context,val AnimeItemClick: (Int) -> Unit): RecyclerView.Adapter<AnimeListAdapter.SearchViewHolder>() {
    var AnimeList: List<AnimeResults> = emptyList<AnimeResults>()

    fun setData(list: List<AnimeResults>){
        AnimeList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_anime_search, parent,false))
    }

    override fun getItemCount(): Int {
        return AnimeList.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val Anime = AnimeList[position]

        Glide.with(_Contexto).load(Anime.imageUrl).into(holder.itemView.img_anime)
        holder.itemView.txt_titulo.text = "${Anime.title}"
        holder.itemView.txt_sinop.text = "${Anime.synopsis}"

        holder.itemView.setOnClickListener { AnimeItemClick(position + 1) }
    }

    class SearchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}