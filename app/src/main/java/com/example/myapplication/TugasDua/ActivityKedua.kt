package com.example.myapplication.TugasDua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityKeduaBinding

class ActivityKedua : AppCompatActivity() {
    lateinit var binding : ActivityKeduaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeduaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get data serializable

        val getDataStudent = intent.getSerializableExtra("DATASTUDENT") as StudentAndroid
        val nama = getDataStudent.name
        val email = getDataStudent.email
        val phone = getDataStudent.phone
        val address = getDataStudent.address
        val age = getDataStudent.age

        binding.txtName.text = getDataStudent.name
        binding.txtEmail.text = getDataStudent.email
        binding.txtPhone.text = getDataStudent.phone
        binding.txtAdress.text = getDataStudent.address
        binding.txtAge.text = getDataStudent.age.toString()

    }
}