package com.example.elektrikliaractasarim.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.elektrikliaractasarim.R
import com.example.elektrikliaractasarim.databinding.FragmentAnasayfaBinding
import com.example.elektrikliaractasarim.ui.AnasayfaFragmentDirections.Companion.logoGecis
import com.example.elektrikliaractasarim.ui.viewmodel.AnasayfaViewModel
import com.example.elektrikliaractasarim.util.gecisYap
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)
        binding.anasayfaFragment=this
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun buttonKesfet(it:View){
        //extension which i declared in extensions
        Navigation.gecisYap(it)
    }
    //databinding yapıldı
}