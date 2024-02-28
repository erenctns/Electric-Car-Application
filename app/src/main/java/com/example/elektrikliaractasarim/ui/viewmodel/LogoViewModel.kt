package com.example.elektrikliaractasarim.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.elektrikliaractasarim.data.entity.Logolar
import com.example.elektrikliaractasarim.data.repo.ArabalarRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LogoViewModel @Inject constructor(var arepo:ArabalarRepository): ViewModel() {
    var arabalarListesi = MutableLiveData<List<Logolar>>()

    init {
        arabalariYukle()
    }

    fun arabalariYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            arabalarListesi.value=arepo.arabalariYukle()
        }
    }
}