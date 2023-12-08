package com.registrado.self_carereminder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.registrado.self_carereminder.databinding.ActivityFrontBinding

class FrontActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFrontBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrontBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frontBttn.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
        }

        Glide.with(this)
            .load("https://png.pngtree.com/png-vector/20220731/ourmid/pngtree-skin-care-logo-png-image_6093739.png")
            .into(binding.frontImage)
    }
}
