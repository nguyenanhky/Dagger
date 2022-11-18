package kynvfhn.fsoft.sharingdagger.settings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kynvfhn.fsoft.sharingdagger.MyApplication
import kynvfhn.fsoft.sharingdagger.R
import kynvfhn.fsoft.sharingdagger.databinding.ActivitySettingsBinding
import kynvfhn.fsoft.sharingdagger.login.LoginActivity

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    private lateinit var settingViewModel: SettingViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater);
        setContentView(binding.root)

        val userManager = (application as MyApplication).userManager
        settingViewModel = SettingViewModel(userManager.userDataRepository!!, userManager)
        setupViews()
    }

    private fun setupViews() {
        binding.refresh.setOnClickListener {
            settingViewModel.refreshNotifications()
        }
        binding.logout.setOnClickListener {
            settingViewModel.logout()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}