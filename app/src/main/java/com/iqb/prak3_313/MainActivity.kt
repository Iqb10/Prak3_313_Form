package com.iqb.prak3_313

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.iqb.prak3_313.HasilActivity.Companion.DATA_AGE
import com.iqb.prak3_313.HasilActivity.Companion.DATA_EMAIL
import com.iqb.prak3_313.HasilActivity.Companion.DATA_JK
import com.iqb.prak3_313.HasilActivity.Companion.DATA_NAMA
import com.iqb.prak3_313.HasilActivity.Companion.DATA_USERNAME
import com.iqb.prak3_313.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var nama = ""
    private var username = ""
    private var age = ""
    private var email = ""
    private var jk = ""
    private var password = ""
    private var confirmpassword = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSubmit.setOnClickListener {
                val nama = isinama.text.toString()
                if (nama.isEmpty()){
                    isinama.error = "Name harus diisi"
                    return@setOnClickListener
                }

                val username = isiusername.text.toString()
                if (username.isEmpty()){
                    isiusername.error = "Username harus diisi"
                    return@setOnClickListener
                }

                val age = isiage.text.toString()
                if (age.isEmpty()){
                    isiage.error = "Age harus diisi"
                    return@setOnClickListener
                }

                val email = isiemail.text.toString()
                if (email.isEmpty()){
                    isiemail.error = "Email harus diisi"
                    return@setOnClickListener
                }

                if (rdb1.isChecked){
                    jk = "Laki-laki"
                }
                if (rdb2.isChecked){
                    jk = "Perempuan"
                }

                val password = isipassword.text.toString()
                if (password.isEmpty()){
                    isipassword.error = "Password harus diisi"
                    return@setOnClickListener
                }

                val confirmpassword = isiconfirmpassword.text.toString()
                if (confirmpassword.isEmpty()){
                    isiconfirmpassword.error = "Confirmasi password harus diisi"
                    return@setOnClickListener
                }

                if (password != confirmpassword){
                    isiconfirmpassword.error = "Password dan confirm password tidak sama"
                    return@setOnClickListener
                }

                val intent = Intent(this@MainActivity, HasilActivity::class.java)
                    .putExtra(DATA_NAMA, nama)
                    .putExtra(DATA_USERNAME, username)
                    .putExtra(DATA_AGE, age)
                    .putExtra(DATA_EMAIL, email)
                    .putExtra(DATA_JK, jk)

                startActivity(intent)
            }
        }
    }
}