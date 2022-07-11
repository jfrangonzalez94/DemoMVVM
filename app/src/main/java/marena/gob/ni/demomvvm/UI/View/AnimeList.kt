package marena.gob.ni.demomvvm.UI.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import marena.gob.ni.demomvvm.R
import marena.gob.ni.demomvvm.UI.ViewModel.AnimeListViewModel
import kotlinx.android.synthetic.main.activity_main.*
import marena.gob.ni.demomvvm.UI.Adapter.AnimeListAdapter

class AnimeList : AppCompatActivity() {

    private lateinit var viewModel: AnimeListViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(AnimeListViewModel::class.java)

        initUI()
    }

    private fun initUI() {
        animelistRecyclerView.layoutManager = LinearLayoutManager(this)
        animelistRecyclerView.adapter = AnimeListAdapter(this) {
            /*
            val intent = Intent(this, AnimeInfoActivity::class.java)
            intent.putExtra("id", it)
            startActivity(intent)
            */
            Toast.makeText(this, "Anime: $it", Toast.LENGTH_LONG).show()
        }

        viewModel.getAnimeList()

        viewModel.AnimeList.observe(this, Observer {
            (animelistRecyclerView.adapter as AnimeListAdapter).setData(it)
        })
    }
}