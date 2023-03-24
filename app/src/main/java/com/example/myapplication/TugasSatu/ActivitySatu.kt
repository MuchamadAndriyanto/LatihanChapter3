package com.example.myapplication.TugasSatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySatuBinding

class ActivitySatu : AppCompatActivity() {
    lateinit var binding : ActivitySatuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            val namamahasiswa = binding.txtName.text.toString()
            val bundle = Bundle()
            val move = Intent (this, ActivityDua::class.java)
            bundle.putString("nama", namamahasiswa)
            bundle.putInt("umur", 20)
            move.putExtras(bundle)
            startActivity(move)
        }
    }
}