package com.egitim.zaimders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.egitim.zaimders.databinding.ActivityMainBinding
import com.orhanobut.hawk.Hawk
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Değişken tanımlama

        var sayi = 10
        sayi = 20


        //f(x) = (x2 + y2) + z2
        var x = 10
        var y = 20
        var z = 30
        var denklem = ((x * x) + (y * y)) + (z * z)

        val sayi1 = 30
        if (sayi1 > 50){
            Log.i("Sonuc", "Sayi1 50'den büyüktür.")
        }else{
            Log.i("Sonuc", "Sayi1 50'den küçüktür.")
        }

        //String methodlar
        var isim = "Murat Karabulut      " // ['M', 'u', 'r']
        Log.i("Sonuc büyük harf", isim.uppercase())
        Log.i("Sonuc kucuk harf", isim.lowercase())
        Log.i("Sonuc kucuk harf", isim.substring(0, 3)) // 0 1 2
        Log.i("Sonuc", isim.trim().length.toString())
        Log.i("Sonuc", isim.replace("Kara", "Beyaz"))
        Log.i("Sonuc", isim.reversed())
        Log.i("Sonuc", isim.toCharArray().toTypedArray()[0].toString())


        val liste: ArrayList<String> = arrayListOf()
        with(liste){
            add("Deneme")
            add("Deneme2")
            add("Deneme3")
        }


        var sayiListesi: ArrayList<Int> = arrayListOf()
        sayiListesi.add(10)
        sayiListesi.add(20)
        sayiListesi.add(30)
        sayiListesi.add(40)

        sayiListesi.filter { it > 20 }.forEach {

        }

        sayiListesi.find { it > 20 }

        liste.removeAt(0)

        liste.clear()
        if (liste.isEmpty().not()){
            for (x in 0..liste.size){
                Log.i("Sonuc", liste.get(x))
            }

            liste.forEach {
                Log.i("Sonuc", it)
            }
        }else{
            Log.i("Sonuc", "Liste boş")
        }
        // 1 1 2 3 5 8

        ikiSayiTopla()

        var toplam2 = sayi1() + sayi2()

        merhabaDe("Arkadaşlar")
    }

    fun sayi1() : Int{
        return 5
    }
    fun sayi2() : Int{
        return 10
    }

    fun merhabaDe(msg: String){
        Log.i("Sonuc", msg)
    }

    fun ikiSayiTopla() : Int{
        var sayi1 = 10
        var sayi2 = 20
        var toplam = sayi1 + sayi2
        return toplam
    }
}