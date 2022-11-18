package kynvfhn.fsoft.sharingdagger.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kynvfhn.fsoft.sharingdagger.MyApplication
import kynvfhn.fsoft.sharingdagger.R
import kynvfhn.fsoft.sharingdagger.databinding.ActivityRegistrationBinding
import kynvfhn.fsoft.sharingdagger.main.MainActivity
import kynvfhn.fsoft.sharingdagger.registration.enterdetails.EnterDetailsFragment
import kynvfhn.fsoft.sharingdagger.registration.termsandconditions.TermsAndConditionsFragment

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    lateinit var registrationViewModel: RegistrationViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registrationViewModel = RegistrationViewModel((application as MyApplication).userManager)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_holder,EnterDetailsFragment())
            .commit()
    }

    fun onDetailsEntered(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_holder,TermsAndConditionsFragment())
            .addToBackStack(TermsAndConditionsFragment::class.java.simpleName)
            .commit()
    }

    fun onTermsAndConditionsAccepted(){
        registrationViewModel.registerUser()
        startActivity(Intent(this, MainActivity::class.java));
        finish()

    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

}