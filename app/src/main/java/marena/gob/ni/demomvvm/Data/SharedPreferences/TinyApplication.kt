package marena.gob.ni.demomvvm.Data.SharedPreferences

import android.app.Application

class TinyApplication : Application() {

    companion object {
        lateinit var TinyDBPref: TinyDB
    }

    override fun onCreate() {
        super.onCreate()
        TinyDBPref = TinyDB(applicationContext)
    }
}