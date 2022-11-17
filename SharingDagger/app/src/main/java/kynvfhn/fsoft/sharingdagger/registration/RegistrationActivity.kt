package kynvfhn.fsoft.sharingdagger.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kynvfhn.fsoft.sharingdagger.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}