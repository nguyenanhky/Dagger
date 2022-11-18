package kynvfhn.fsoft.sharingdagger

import android.app.Application
import kynvfhn.fsoft.sharingdagger.storage.SharedPreferencesStorage
import kynvfhn.fsoft.sharingdagger.user.UserManager

class MyApplication : Application() {
    open  val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}