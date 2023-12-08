package com.registrado.self_carereminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.registrado.self_carereminder.databinding.ActivityProcedureViewBinding

class ProcedureViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProcedureViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProcedureViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val procedureList = listOf(
            AdapterForProcedure.MyDataModel(
                "Protect With SunScreen",
                "All of the experts we consulted unanimously agreed on one thing: that sunscreen is, hands down, the most crucial skin-care product. It’s “of utmost importance as part of your year-round regimen,” Dr. Charles points out. “Daily and consistent sunscreen use helps to prevent the development of fine lines and wrinkles, textural imperfections, and changes in the appearance of pores over time. More importantly, daily sunscreen use can help to prevent the formation of certain skin cancers.” To make it easy to remember, experts recommend using a daily moisturizer with a built-in broad spectrum SPF of at least 30."
            ),
            AdapterForProcedure.MyDataModel(
                "Moisturizing",
                "The most basic function of a moisturizer is to hydrate and soften the skin. “Essentially, moisturizers assist in preventing water loss through the outer layers of skin,” Dr. Charles explains. “They can also complement the naturally found protective oils and other building blocks within the skin, such as ceramides.” This is one product that doctors recommend using year-round, for all skin types. “Skin naturally loses the ability to retain moisture as we age,” Dr. Nazarian insists, “and daily activities, such as washing, can strip natural hydrators from the surface.”"
            ),
            AdapterForProcedure.MyDataModel(
                "The Difference Between a Day and Night Cream",
                "Creams you apply in the morning are equipped to protect your skin from the environmental aggressors you’ll face when you leave the house — many contain antioxidants to minimize pollution-based free radicals and sunscreen to shield you from ultraviolet radiation. They typically have a lightweight consistency. Night creams, on the other hand, focus on repairing any damage you might have picked up with ingredients like retinol to speed cellular turnover and counteract dark spots. These creams also replenish moisture levels, which naturally dip in the evening, with emollients that often create a rich, thick texture."
            ),
            AdapterForProcedure.MyDataModel(
                "Eye Creams",
                "Can you survive without an eye cream? Absolutely. But, if you have specific concerns — like hyperpigmentation, dryness or puffiness — you might want to try one. “The skin around the eyes is quite thin and delicate, and more likely to react to irritating ingredients than other areas,” Dr. Nazarian says. “Therefore, dermatologists typically recommend an eye cream that considers the potential sensitivity and has more tolerable concentrations of active ingredients.”"
            ),
            AdapterForProcedure.MyDataModel(
                "Apply Toning",
                "For many, the word “toner” brings to mind stinging astringents from the ’80s. “The original was an alcohol-based product that was used to dry up oily skin and remove any leftover dirt following cleansing,” Dr. Nazarian says. Today’s formulas, however, have evolved. Think of them as supplements — these thin liquids deliver an extra shot of nutrients, helping the other products in your regimen absorb better, while still balancing your complexion. Most experts, the New York City aesthetician Jordana Mattioli says, consider toner to be optional: “It can be a good way to add in specific ingredients that you may not have in your other products or add another layer of skin-replenishment.”"
            ),
            AdapterForProcedure.MyDataModel(
                "Cleansing",
                "Washing your face is the most basic and essential step of any routine, says the New York City dermatologist Dr. Carlos Charles. “Our skin comes in contact with environmental pollutants, dirt and other factors each day that should be gently removed.” Wash twice a day, morning and night, to avoid clogged pores, dullness and acne."
            ),
        )

        val adapter = AdapterForProcedure(procedureList, ::onItemClick)
        with(binding.procedureNameRecyclerView){
            layoutManager = LinearLayoutManager(this@ProcedureViewActivity)
            this.adapter = adapter
        }
    }
    private fun onItemClick(item: AdapterForProcedure.MyDataModel) {
        // Handle the item click here
        val intent = Intent(this, ProcedureDetailActivity::class.java).apply {
            putExtra("NAME_PARAMS",item.procedureName )
            putExtra("DETAIL_PARAMS", item.description)
        }
        startActivity(intent)
    }
}