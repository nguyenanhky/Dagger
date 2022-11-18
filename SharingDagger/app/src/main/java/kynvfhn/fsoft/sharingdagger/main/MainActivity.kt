package kynvfhn.fsoft.sharingdagger.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kynvfhn.fsoft.sharingdagger.MyApplication
import kynvfhn.fsoft.sharingdagger.databinding.ActivityMainBinding
import kynvfhn.fsoft.sharingdagger.login.LoginActivity
import kynvfhn.fsoft.sharingdagger.registration.RegistrationActivity
import kynvfhn.fsoft.sharingdagger.settings.SettingsActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val userManager = ((application as MyApplication).userManager)
        if(!userManager.isUserLoggerIn()){
            if(!userManager.isUserRegistered()){
                startActivity(Intent(this,RegistrationActivity::class.java))
                finish()
            }else{
                startActivity(Intent(this,LoginActivity::class.java))
                finish()
            }
        }else{
            setContentView(binding.root)
            mainViewModel=MainViewModel(userManager.userDataRepository!!)
            setupViews()
        }

    }

    private fun setupViews() {
        binding.hello.text = mainViewModel.welcomeText

        binding.settings.setOnClickListener {
            startActivity(Intent(this,SettingsActivity::class.java))
        }
    }


    override fun onResume() {
        super.onResume()

        binding.notifications.setOnClickListener {

        }
    }
}