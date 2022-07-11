package marena.gob.ni.demomvvm.Data.Network

import marena.gob.ni.demomvvm.Data.Model.AnimeModel
import marena.gob.ni.demomvvm.Data.Model.AnimeResults
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface AnimeApiService {
    @GET("search/anime?q=naruto")
    fun getAllAnime(): Call<AnimeModel>
}