package com.example.elektrikliaractasarim.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.elektrikliaractasarim.R
import com.example.elektrikliaractasarim.data.adapter.UstResimlerAdapter
import com.example.elektrikliaractasarim.databinding.FragmentBilgiBinding
import com.example.elektrikliaractasarim.ui.viewmodel.BilgiViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BilgiFragment : Fragment() {
    private lateinit var binding: FragmentBilgiBinding
    private lateinit var viewModel: BilgiViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_bilgi, container, false)

        val bundle:BilgiFragmentArgs by navArgs()
        var model = bundle.model
        binding.modellerNesnesi=model
        var ustResimlerListesi = bundle.model.UstResimListesi
        var gelenLogoAd = bundle.model.logoResim
        var gelenResim1=bundle.model.resim1
        binding.ivResimBilgi.setImageResource(resources.getIdentifier(gelenResim1,"drawable",requireContext().packageName))
        binding.ivLogoBilgi.setImageResource(resources.getIdentifier(gelenLogoAd,"drawable",requireContext().packageName))

        var ustResimlerAdapter = UstResimlerAdapter(requireContext(),ustResimlerListesi)
        binding.ustResimlerAdapter=ustResimlerAdapter

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:BilgiViewModel by viewModels()
        viewModel=tempViewModel
    }

//databinding yapıldı
}