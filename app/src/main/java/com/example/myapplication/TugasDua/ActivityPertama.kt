package com.example.myapplication.TugasDua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityPertamaBinding


class ActivityPertama: AppCompatActivity() {
    lateinit var binding : ActivityPertamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPertamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSerial.setOnClickListener {
            val dataStudent = StudentAndroid("Muchamad Andriyanto","andri@gmail.com", "08880347463","Tegal",20)
            val move = Intent(this, ActivityKedua::class.java)
            move.putExtra("DATASTUDENT", dataStudent)
            startActivity(move)
        }
    }
}