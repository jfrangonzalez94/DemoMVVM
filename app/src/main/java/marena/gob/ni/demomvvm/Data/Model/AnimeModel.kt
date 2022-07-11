package marena.gob.ni.demomvvm.Data.Model

import com.google.gson.annotations.SerializedName

data class AnimeModel(
    @SerializedName("request_hash"         ) var requestHash        : String?            = null,
    @SerializedName("request_cached"       ) var requestCached      : Boolean?           = null,
    @SerializedName("request_cache_expiry" ) var requestCacheExpiry : Int?               = null,
    @SerializedName("API_DEPRECATION"      ) var APIDEPRECATION     : Boolean?           = null,
    @SerializedName("API_DEPRECATION_DATE" ) var APIDEPRECATIONDATE : String?            = null,
    @SerializedName("API_DEPRECATION_INFO" ) var APIDEPRECATIONINFO : String?            = null,
    @SerializedName("results"              ) var results            : ArrayList<AnimeResults> = arrayListOf(),
    @SerializedName("last_page"            ) var lastPage           : Int?               = null
)

data class AnimeResults (
    @SerializedName("mal_id"     ) var malId     : Int?     = null,
    @SerializedName("url"        ) var url       : String?  = null,
    @SerializedName("image_url"  ) var imageUrl  : String?  = null,
    @SerializedName("title"      ) var title     : String?  = null,
    @SerializedName("airing"     ) var airing    : Boolean? = null,
    @SerializedName("synopsis"   ) var synopsis  : String?  = null,
    @SerializedName("type"       ) var type      : String?  = null,
    @SerializedName("episodes"   ) var episodes  : Int?     = null,
    @SerializedName("score"      ) var score     : Double?  = null,
    @SerializedName("start_date" ) var startDate : String?  = null,
    @SerializedName("end_date"   ) var endDate   : String?  = null,
    @SerializedName("members"    ) var members   : Int?     = null,
    @SerializedName("rated"      ) var rated     : String?  = null
)