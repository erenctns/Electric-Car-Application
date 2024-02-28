package com.example.elektrikliaractasarim.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.elektrikliaractasarim.data.entity.UstResimlerBilgi
import com.example.elektrikliaractasarim.databinding.CardTasarimBinding
import com.example.elektrikliaractasarim.databinding.UstResimBinding

class UstResimlerAdapter(var mContext: Context,var ustResimlerListesi:List<UstResimlerBilgi>)
    :RecyclerView.Adapter<UstResimlerAdapter.UstResimTutucu>(){
    inner class UstResimTutucu(var tasarim:UstResimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UstResimTutucu {
        val binding =  UstResimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return UstResimTutucu(binding)
    }

    override fun onBindViewHolder(holder: UstResimTutucu, position: Int) {
        var resim = ustResimlerListesi.get(position)
        var t = holder.tasarim
        t.ivResim.setImageResource(mContext.resources.getIdentifier(resim.resim,"drawable",mContext.packageName))

    }
    override fun getItemCount(): Int {
        return ustResimlerListesi.size
    }
}