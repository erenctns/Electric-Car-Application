package com.example.elektrikliaractasarim.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.elektrikliaractasarim.data.entity.Modeller
import com.example.elektrikliaractasarim.databinding.CardTasarimBinding
import com.example.elektrikliaractasarim.databinding.CardTasarimDetayBinding
import com.example.elektrikliaractasarim.ui.DetayFragmentDirections
import com.example.elektrikliaractasarim.util.gecisYap

class DetayAdapter(var mContext: Context,var modellerListesi:List<Modeller>)
    :RecyclerView.Adapter<DetayAdapter.CardTasarimDetayTutucu>(){
    inner class CardTasarimDetayTutucu(var tasarim:CardTasarimDetayBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimDetayTutucu {
        val binding =  CardTasarimDetayBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimDetayTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimDetayTutucu, position: Int) {
        var model = modellerListesi.get(position)
        var t = holder.tasarim

        t.tvModel.text=model.ad

        t.cardViewDetay.setOnClickListener {
            val gecis = DetayFragmentDirections.bilgiGecis(model=model)
            //extension which i declared in extensions
            Navigation.gecisYap(it,gecis)
        }



    }
    override fun getItemCount(): Int {
        return modellerListesi.size
    }
}