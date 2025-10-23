package com.iqb.prak3_313

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iqb.prak3_313.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(DATA_NAMA)
        val username = intent.getStringExtra(DATA_USERNAME)
        val age = intent.getStringExtra(DATA_AGE)
        val email = intent.getStringExtra(DATA_EMAIL)
        val jk = intent.getStringExtra(DATA_JK)

        binding.apply {
            tampilNama.text = "Full Name: $nama"
            tampilusername.text = "Username: $username"
            tampilage.text = "Age: $age"
            tampilemail.text = "Email: $email"
            tampilJenisKelamin.text = "Gender: $jk"
        }
    }
    companion object{
        const val DATA_NAMA = "data_nama"
        const val DATA_USERNAME = "data_username"
        const val DATA_AGE = "data_age"
        const val DATA_EMAIL = "data_email"
        const val DATA_JK = "data_jeniskelamin"

    }
}