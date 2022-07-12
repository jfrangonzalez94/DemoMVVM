package marena.gob.ni.demomvvm.Data.Model

import com.google.gson.annotations.SerializedName

data class AnimeModel(
    @SerializedName("request_hash"         ) var requestHash        : String?            = null,
    @SerializedName("results"              ) var results            : ArrayList<AnimeResults> = arrayListOf()
)

data class AnimeResults (
    @SerializedName("mal_id"     ) var malId     : Int?     = null,
    @SerializedName("image_url"  ) var imageUrl  : String?  = null,
    @SerializedName("title"      ) var title     : String?  = null,
    @SerializedName("synopsis"   ) var synopsis  : String?  = null
)