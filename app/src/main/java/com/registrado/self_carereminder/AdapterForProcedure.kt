package com.registrado.self_carereminder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.registrado.self_carereminder.databinding.ProcedureLayoutBinding


class AdapterForProcedure(
    private var procedureList: List<MyDataModel>,
    private val onItemClick: (MyDataModel) -> Unit
) : RecyclerView.Adapter<AdapterForProcedure.MyViewHolder>() {

    data class MyDataModel(val procedureName: String, val description: String)

    inner class MyViewHolder(private val binding: ProcedureLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyDataModel) {
            with(binding) {
                procedureView.text = item.procedureName
            }

            binding.root.setOnClickListener {
                onItemClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ProcedureLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(procedureList[position])
    }

    override fun getItemCount(): Int {
        return procedureList.size
    }
}