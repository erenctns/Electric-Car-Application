package com.example.elektrikliaractasarim.data.entity

import java.io.Serializable

data class Logolar(var id:Int,var ad:String,var resim:String,var yazi:String,var modelListesi:List<Modeller>):Serializable {
}