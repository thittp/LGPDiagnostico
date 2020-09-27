package com.thiagottp.lgpd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TelaLei : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_lei)


        supportActionBar?.title = "A LEI"
    }
}