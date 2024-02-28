package com.example.elektrikliaractasarim.util

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.elektrikliaractasarim.ui.AnasayfaFragmentDirections

fun Navigation.gecisYap(it:View){
    findNavController(it).navigate(AnasayfaFragmentDirections.logoGecis())
}
fun Navigation.gecisYap(it:View,id:NavDirections){
    findNavController(it).navigate(id)
}