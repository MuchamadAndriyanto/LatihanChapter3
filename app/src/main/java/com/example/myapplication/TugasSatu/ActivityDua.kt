package com.example.myapplication.TugasSatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDuaBinding

class ActivityDua : AppCompatActivity() {
    lateinit var binding: ActivityDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getbundle = intent.extras
        val name = getbundle?.getString("nama")
        val age = getbundle?.getInt("umur")
        binding.txtName.text = "Haloo, " +  name + " Umur kamu : $age"

    }
}