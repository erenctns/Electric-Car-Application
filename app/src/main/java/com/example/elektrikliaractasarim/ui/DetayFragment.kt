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
import com.example.elektrikliaractasarim.data.adapter.DetayAdapter
import com.example.elektrikliaractasarim.databinding.FragmentDetayBinding
import com.example.elektrikliaractasarim.ui.viewmodel.DetayViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    private lateinit var viewModel: DetayViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val gelenListe = bundle.logolar.modelListesi

        var detayAdapter = DetayAdapter(requireContext(),gelenListe)
        binding.detayAdapter=detayAdapter


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:DetayViewModel by viewModels()
        viewModel=tempViewModel
    }

//databinding yapıldı
}