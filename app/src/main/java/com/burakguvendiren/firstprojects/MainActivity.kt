package com.burakguvendiren.firstprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println ("Hello  World")

        //değişkenler ve sabitler
        //Integer

        println ("-----Int-----")


        println (5 * 10)
        var a = 5
        var b = 10
        println (a * b)
        var old = 60
        println (old * 10 / 7)
        old = 60
        println (old * 5 / 8)

        val x = 5
        val y = 20

        println(x+y)


        // camelCase
        // snake_case

        val yasSonucu = old * x
        println(yasSonucu)

        //Tanımlama (Defining)
        val benimIntegerim : Int

        //Başlatma, Değerini Atama (Initializing, Inilitiazation)
        benimIntegerim = 5
        var yeniInteger : Int = 20
        println(benimIntegerim / 2)

        //Long
        println ("-----Int-----")

        var myLong : Long = 100
        myLong = 30000000
        println(myLong)



    }
}