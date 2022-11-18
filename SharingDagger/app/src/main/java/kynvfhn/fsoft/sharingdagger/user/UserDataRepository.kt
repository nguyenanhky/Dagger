package kynvfhn.fsoft.sharingdagger.user

import kotlin.random.Random


class UserDataRepository(
    val userManager: UserManager
) {
    val username: String
        get() = userManager.username

    var unreadNotifications: Int

    init {
        unreadNotifications = Random.nextInt(until = 100)
    }
    fun refreshUnreadNotifications() {
        unreadNotifications = Random.nextInt(until = 100)
    }
}