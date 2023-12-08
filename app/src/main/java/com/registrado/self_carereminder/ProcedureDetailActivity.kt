package com.registrado.self_carereminder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.registrado.self_carereminder.databinding.ActivityProcedureDetailBinding

class ProcedureDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProcedureDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProcedureDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ProcNameParams = intent.getStringExtra("NAME_PARAMS")
        val DescripParams = intent.getStringExtra("DETAIL_PARAMS")


        binding.procedureName.text = ProcNameParams
        binding.description.text = DescripParams
    }
}