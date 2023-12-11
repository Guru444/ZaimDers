package com.egitim.zaimders.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.egitim.zaimders.R
import com.egitim.zaimders.databinding.DepremListesiItemLayoutBinding
import com.egitim.zaimders.model.Result

class DepremListesiAdapter : RecyclerView.Adapter<DepremListesiAdapter.DepremViewHolder>() {

    private var depremListesi: ArrayList<Result> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : DepremViewHolder{
        val binding =
            DepremListesiItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DepremViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DepremListesiAdapter.DepremViewHolder, position: Int) {
        holder.bind(depremListesi[position])
    }

    override fun getItemCount(): Int = depremListesi.size


    inner class DepremViewHolder(private val binding: DepremListesiItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(s: Result) {
            binding.apply {
                tvSehir.text = s.title
                tvBuyukluk.text = s.mag.toString()
                tvDate.text = s.date
                if (s.mag > 3.0){
                    tvSehir.setTextColor(ContextCompat.getColor(tvSehir.context, R.color.red))
                }else{
                    tvSehir.setTextColor(ContextCompat.getColor(tvSehir.context, R.color.black))
                }
            }
        }
    }

    fun setDepremListesi(list: ArrayList<Result>){
        depremListesi = list
        notifyDataSetChanged()
    }


}