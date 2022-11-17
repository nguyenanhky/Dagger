package kynvfhn.fsoft.sharingdagger.storage

import android.content.Context
import kynvfhn.fsoft.sharingdagger.Constance

class SharedPreferencesStorage(
    context:Context
) :Storage{
    private val sharedPreferences = context.getSharedPreferences(Constance.KEY_DATA,Context.MODE_PRIVATE)
    override fun setString(key: String, value: String) {
       with(sharedPreferences.edit()){
           putString(key,value)
           apply()
       }
    }

    override fun getString(key: String): String {
       return sharedPreferences.getString(key,"")!!
    }

}