package kynvfhn.fsoft.sharingdagger.user

import kynvfhn.fsoft.sharingdagger.Constance
import kynvfhn.fsoft.sharingdagger.storage.Storage

class UserManager(
    val storage: Storage
) {
    var userDataRepository: UserDataRepository? = null

    val username: String
        get() = storage.getString(Constance.REGISTERED_USER)

    fun isUserLoggerIn() = userDataRepository !=null

    fun isUserRegistered() = storage.getString(Constance.REGISTERED_USER).isNotEmpty()

    fun registerUser(username:String, password:String){
        storage.setString(Constance.REGISTERED_USER,username)
        storage.setString("$username${Constance.PASSWORD_SUFFIX}", password)
        userJustLoggedIn()
    }

    fun loginUser(username: String, password: String):Boolean{
        val registeredUser = this.username
        if(registeredUser!=username)
            return false
        val registerPassword = storage.getString("$username${Constance.PASSWORD_SUFFIX}")
        if(registerPassword!=password)
            return false
        userJustLoggedIn()
        return true
    }

    fun logout(){
        userDataRepository=null
    }

    fun unregister(){
        val username = storage.getString(Constance.REGISTERED_USER)
        storage.setString(Constance.REGISTERED_USER,"")
        storage.setString("$username${Constance.PASSWORD_SUFFIX}", "")
        logout()
    }

    private fun userJustLoggedIn() {
        userDataRepository = UserDataRepository(this)
    }
}