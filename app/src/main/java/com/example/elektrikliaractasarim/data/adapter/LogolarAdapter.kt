package com.example.elektrikliaractasarim.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.elektrikliaractasarim.data.entity.Logolar
import com.example.elektrikliaractasarim.databinding.CardTasarimBinding
import com.example.elektrikliaractasarim.databinding.FragmentAnasayfaBinding
import com.example.elektrikliaractasarim.ui.LogoFragmentDirections
import com.example.elektrikliaractasarim.util.gecisYap

class LogolarAdapter(var mContext: Context,var logolarListesi:List<Logolar>)
    :RecyclerView.Adapter<LogolarAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding =  CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var logo = logolarListesi.get(position)
        var t = holder.tasarim
        t.ivLogo.setImageResource(mContext.resources.getIdentifier(logo.resim,"drawable",mContext.packageName))
        t.tvLogo.text=logo.yazi

        t.cardViewLogo.setOnClickListener {
            val logoGecis = LogoFragmentDirections.detayGecis(logolar = logo)
            //extension which i declared in extensions
            Navigation.gecisYap(it,logoGecis)
        }
    }
    override fun getItemCount(): Int {
        return logolarListesi.size
    }
}