package marena.gob.ni.demomvvm.Data.SharedPreferences

import android.content.Context

class TinyDB(val _Context: Context) {

    val SHARED_NAME = "TinyDB"
    val storage = _Context.getSharedPreferences(SHARED_NAME, 0)

    fun putString(key: String, value: String) {
        storage.edit().putString(key, value).apply()
    }

    fun putInt(key: String, value: Int) {
        storage.edit().putInt(key, value).apply()
    }

    fun putBoolean(key: String, value: Boolean) {
        storage.edit().putBoolean(key, value).apply()
    }


    fun getString(key: String): String {
        return storage.getString(key, "")!!
    }

    fun getInt(key: String): Int {
        return storage.getInt(key, 0)!!
    }

    fun getBoolean(key: String): Boolean {
        return storage.getBoolean(key, false)!!
    }
}