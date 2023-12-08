package com.registrado.self_carereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.registrado.self_carereminder.databinding.ActivityHomePageBinding

class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding

    private val imageUrls = arrayOf(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwr3qSrEj5xzoe34WiZL1yarpFTlT4eTp5s8FFKxrsog&s",
        "https://www.liveabout.com/thmb/HwpztV5C5ThLsNIZGjNDymtVhsA=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/keeping-my-face-silky-smooth-501263593-5a4e7e4e7d4be8003676edc2.jpg",
        "https://images.everydayhealth.com/images/retinol-a-complete-guide-to-skin-care-722x406.jpg?sfvrsn=5335da2b_1",
        "https://static01.nyt.com/images/2017/09/29/t-magazine/guide-skincare-slide-68PT/guide-skincare-slide-68PT-jumbo.jpg?quality=75&auto=webp",
        "https://www.nm.org/-/media/northwestern/healthbeat/images/daily-health/nm-skincare-routine-thumb.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.procedureBttn.setOnClickListener {
            startActivity(Intent(this, ProcedureViewActivity::class.java))
        }

        val randomImageUrl = imageUrls.random()

        Glide.with(this)
            .load(randomImageUrl)
            .into(binding.frontImage)
    }
}
