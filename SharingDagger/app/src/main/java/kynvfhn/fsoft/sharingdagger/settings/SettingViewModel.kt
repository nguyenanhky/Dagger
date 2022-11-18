package kynvfhn.fsoft.sharingdagger.settings

import kynvfhn.fsoft.sharingdagger.user.UserDataRepository
import kynvfhn.fsoft.sharingdagger.user.UserManager

class SettingViewModel(
    private val userDataRepository: UserDataRepository,
    private val userManager: UserManager
) {
    fun refreshNotifications() {
        userDataRepository.refreshUnreadNotifications()
    }
    fun logout(){
        userManager.logout()
    }
}