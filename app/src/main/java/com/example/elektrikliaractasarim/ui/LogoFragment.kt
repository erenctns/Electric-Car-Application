package com.example.elektrikliaractasarim.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.elektrikliaractasarim.R
import com.example.elektrikliaractasarim.data.adapter.LogolarAdapter
import com.example.elektrikliaractasarim.data.entity.Logolar
import com.example.elektrikliaractasarim.data.entity.Modeller
import com.example.elektrikliaractasarim.data.entity.UstResimlerBilgi
import com.example.elektrikliaractasarim.databinding.FragmentLogoBinding
import com.example.elektrikliaractasarim.ui.viewmodel.LogoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LogoFragment : Fragment() {
    private lateinit var binding: FragmentLogoBinding
    private lateinit var viewModel: LogoViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_logo, container, false)

        viewModel.arabalarListesi.observe(viewLifecycleOwner){
            val logolarAdapter = LogolarAdapter(requireContext(),it)
            binding.logolarAdapter=logolarAdapter
        }


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:LogoViewModel by viewModels()
        viewModel=tempViewModel
    }

//databinding yapıldı
}