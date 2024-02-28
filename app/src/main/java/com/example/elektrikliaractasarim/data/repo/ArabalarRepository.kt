package com.example.elektrikliaractasarim.data.repo

import com.example.elektrikliaractasarim.data.datasource.ArabalarDataSource
import com.example.elektrikliaractasarim.data.entity.Logolar

class ArabalarRepository(var ads:ArabalarDataSource) {
    suspend fun arabalariYukle():List<Logolar>{
        return ads.arabalariYukle()
    }
}