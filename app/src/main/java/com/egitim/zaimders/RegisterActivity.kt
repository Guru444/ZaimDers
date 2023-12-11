package com.egitim.zaimders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.egitim.zaimders.databinding.ActivityRegister2Binding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegister2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegister2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            btnRegister.setOnClickListener {
                if (formValidation()){
                    Toast.makeText(applicationContext, "Kayıt başarılı", Toast.LENGTH_SHORT).show()
                }
            }


            rgCinsiyet.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.rd_erkek -> {
                        edtAskerlik.visibility = View.VISIBLE
                    }
                    R.id.rd_kız -> {
                        edtAskerlik.visibility = View.GONE
                    }
                }
            }
        }

    }

    fun formValidation() : Boolean{
        var isValid = true

        binding.apply {
            if (edtFirstname.text.isEmpty()){
                isValid = false
                Toast.makeText(applicationContext, "Ad kısmını boş bırakma", Toast.LENGTH_SHORT).show()
            }
            if (edtLastname.text.isEmpty()){
                isValid = false
                Toast.makeText(applicationContext, "Soyad kısmını boş bırakma", Toast.LENGTH_SHORT).show()
            }
            if (edtMail.text.isEmpty()){
                isValid = false
                Toast.makeText(applicationContext, "Mail kısmını boş bırakma", Toast.LENGTH_SHORT).show()
            }
            if (edtPassword.text.isEmpty()){
                isValid = false
                Toast.makeText(applicationContext, "Password kısmını boş bırakma", Toast.LENGTH_SHORT).show()
            }
            if(rgCinsiyet.getCheckedRadioButtonId() == -1) {
                isValid = false
                Toast.makeText(applicationContext, "Cinsiyet kısmını boş bırakma", Toast.LENGTH_SHORT).show()
            }
        }

        return isValid
    }
}