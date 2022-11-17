package kynvfhn.fsoft.sharingdagger.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kynvfhn.fsoft.sharingdagger.R
import kynvfhn.fsoft.sharingdagger.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}