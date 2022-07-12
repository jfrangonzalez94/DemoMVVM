package marena.gob.ni.demomvvm.UI.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import marena.gob.ni.demomvvm.Core.RetrofitHelper
import marena.gob.ni.demomvvm.Data.Model.AnimeModel
import marena.gob.ni.demomvvm.Data.Model.AnimeResults
import marena.gob.ni.demomvvm.Data.Network.AnimeApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AnimeListViewModel() : ViewModel() {

    private val Repositorio: AnimeApiService =
        RetrofitHelper.getRetrofit().create(AnimeApiService::class.java)

    val AnimeList = MutableLiveData<List<AnimeResults>>()

    fun getAPIAnimeList() {
        val call = Repositorio.getAllAnime()

        call.enqueue(object : Callback<AnimeModel> {
            override fun onResponse(call: Call<AnimeModel>, response: Response<AnimeModel>) {
                response.body()?.results?.let {
                    AnimeList.postValue(it)
                }
            }

            override fun onFailure(call: Call<AnimeModel>, t: Throwable) {
                call.cancel()
            }
        })
    }
}
