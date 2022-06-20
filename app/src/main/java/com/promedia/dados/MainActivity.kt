package com.promedia.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.promedia.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    private val dados = arrayOf<Int>(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
    fun clickOnDado(view: View){
        Snackbar.make(view, (R.drawable.dice6).toString(), Snackbar.LENGTH_LONG).show()
        val d1 = Random.nextInt(1, 6)
        val d2 = Random.nextInt(1, 6)
        b.ivDado1.setImageResource(dados[d1-1])
        b.ivDado2.setImageResource(dados[d2-1])
        b.tvTotal.text = (d1 + d2).toString()
    }
}