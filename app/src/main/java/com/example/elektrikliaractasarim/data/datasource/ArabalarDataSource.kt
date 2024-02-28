package com.example.elektrikliaractasarim.data.datasource
import com.example.elektrikliaractasarim.data.entity.Logolar
import com.example.elektrikliaractasarim.data.entity.Modeller
import com.example.elektrikliaractasarim.data.entity.UstResimlerBilgi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ArabalarDataSource {
    suspend fun arabalariYukle():List<Logolar> =
        withContext(Dispatchers.IO){
            val bmwListesi = ArrayList<Modeller>()
            val jaguarListesi = ArrayList<Modeller>()
            val kiaListesi = ArrayList<Modeller>()
            val mercedesListesi = ArrayList<Modeller>()
            val mgListesi = ArrayList<Modeller>()
            val opelListesi = ArrayList<Modeller>()
            val teslaListesi = ArrayList<Modeller>()
            val toggListesi = ArrayList<Modeller>()
            val volvoListesi = ArrayList<Modeller>()
            val logolarListesi = ArrayList<Logolar>()


            val l1 = Logolar(7,"bmwlogo","bmwlogo","BMW",bmwListesi)
            val l2 = Logolar(3,"jaguarlogo","jaguarlogo","Jaguar",jaguarListesi)
            val l3 = Logolar(4,"kialogo","kialogo","Kia",kiaListesi)
            val l4= Logolar(1,"mercedeslogo","mercedeslogo","Mercedes-Benz",mercedesListesi)
            val l5 = Logolar(5,"mglogo","mglogo","Morris Garages",mgListesi)
            val l6 = Logolar(8,"opellogo","opellogo","OPEL",opelListesi)
            val l7 = Logolar(6,"teslalogo","teslalogo","Tesla",teslaListesi)
            val l8 = Logolar(2,"togglogo","togglogo","Togg",toggListesi)
            val l9 = Logolar(9,"volvologo","volvologo","Volvo",volvoListesi)

            logolarListesi.add(l1)
            logolarListesi.add(l2)
            logolarListesi.add(l3)
            logolarListesi.add(l4)
            logolarListesi.add(l5)
            logolarListesi.add(l6)
            logolarListesi.add(l7)
            logolarListesi.add(l8)
            logolarListesi.add(l9)



            //MARKALARIN KAÇ ADET ELEKTRİKLİ ARACI OLDUĞUNU YAZDIĞIM YER

            //BMW
            val bmwUstResimlerListesi = ArrayList<UstResimlerBilgi>()
            val bmwUstResim1 = UstResimlerBilgi(1,"bmwixust")
            val bmwUstResim2 = UstResimlerBilgi(2,"bmwixust")
            val bmwUstResim3 = UstResimlerBilgi(3,"bmwixust")


            //BMW BİLGİ SAYFASI ÜSTTEKİ RESİMLER
            bmwUstResimlerListesi.add(bmwUstResim1)
            bmwUstResimlerListesi.add(bmwUstResim2)
            bmwUstResimlerListesi.add(bmwUstResim3)


            val bmw1 = Modeller(1,"İX","bmwlogo","bmwix",bmwUstResimlerListesi)
            val bmw2 = Modeller(2,"İX1","bmwlogo","bmwix",bmwUstResimlerListesi)
            val bmw3 = Modeller(3,"İX3","bmwlogo","bmwix3",bmwUstResimlerListesi)
            val bmw4 = Modeller(4,"X1","bmwlogo","bmwix",bmwUstResimlerListesi)
            bmwListesi.add(bmw1)
            bmwListesi.add(bmw2)
            bmwListesi.add(bmw3)
            bmwListesi.add(bmw4)


            //JAGUAR

            val jaguar1= Modeller(1,"I-Pace","jaguarlogo","bmwix",bmwUstResimlerListesi)
            jaguarListesi.add(jaguar1)

            //KİA

            val kia1= Modeller(1,"EV6","kialogo","bmwix",bmwUstResimlerListesi)
            val kia2= Modeller(2,"Niro","kialogo","bmwix",bmwUstResimlerListesi)
            kiaListesi.add(kia1)
            kiaListesi.add(kia2)

            //MERCEDES

            val mercedes1= Modeller(1,"EQA","mercedeslogo","bmwix",bmwUstResimlerListesi)
            val mercedes2= Modeller(2,"EQB","mercedeslogo","bmwix",bmwUstResimlerListesi)
            val mercedes3= Modeller(3,"EQC","mercedeslogo","bmwix",bmwUstResimlerListesi)
            val mercedes4= Modeller(4,"EQS SUV","mercedeslogo","bmwix",bmwUstResimlerListesi)
            mercedesListesi.add(mercedes1)
            mercedesListesi.add(mercedes2)
            mercedesListesi.add(mercedes3)
            mercedesListesi.add(mercedes4)

            //MG

            val mg1 = Modeller(1,"Marvel R","mglogo","bmwix",bmwUstResimlerListesi)
            val mg2 = Modeller(2,"ZS EV","mglogo","bmwix",bmwUstResimlerListesi)
            mgListesi.add(mg1)
            mgListesi.add(mg2)

            //OPEL

            val opel1= Modeller(1,"Mokka-e","opellogo","bmwix",bmwUstResimlerListesi)
            opelListesi.add(opel1)

            //TESLA

            val tesla1= Modeller(1,"Model S","teslalogo","bmwix",bmwUstResimlerListesi)
            val tesla2= Modeller(2,"Model Y","teslalogo","bmwix",bmwUstResimlerListesi)
            teslaListesi.add(tesla1)
            teslaListesi.add(tesla2)

            //TOGG

            //TOGG UST RESİMLER
            val toggUstResimlerListesi=ArrayList<UstResimlerBilgi>()

            val toggUstResim1= UstResimlerBilgi(1,"toggust")
            val toggUstResim2= UstResimlerBilgi(2,"toggust")
            val toggUstResim3= UstResimlerBilgi(3,"toggust")
            toggUstResimlerListesi.add(toggUstResim1)
            toggUstResimlerListesi.add(toggUstResim2)
            toggUstResimlerListesi.add(toggUstResim3)


            val togg1= Modeller(1,"Togg T10X","togglogo","bmwix",toggUstResimlerListesi)
            val togg2= Modeller(2,"Togg T10F","togglogo","bmwix",toggUstResimlerListesi)
            val togg3= Modeller(3,"Togg T8CX","togglogo","bmwix",toggUstResimlerListesi)
            toggListesi.add(togg1)
            toggListesi.add(togg2)
            toggListesi.add(togg3)

            //VOLVO
            val volvo1= Modeller(1,"C40","volvologo","bmwix",bmwUstResimlerListesi)
            val volvo2= Modeller(2,"XC40","volvologo","bmwix",bmwUstResimlerListesi)
            volvoListesi.add(volvo1)
            volvoListesi.add(volvo2)
            return@withContext logolarListesi
        }




}