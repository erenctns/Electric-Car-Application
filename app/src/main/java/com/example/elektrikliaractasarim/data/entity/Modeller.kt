package com.example.elektrikliaractasarim.data.entity

import java.io.Serializable

data class Modeller(var id:Int,
                    var ad:String,
                    var logoResim:String,
                    var resim1:String,
                    var UstResimListesi:List<UstResimlerBilgi>):Serializable {
}