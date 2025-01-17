package com.LuluNaurahHukama.tugas2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {

    private lateinit var txtDetailNamaBuah : TextView
    private lateinit var imgDetailBuah: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtDetailNamaBuah = findViewById(R.id.txtDetailNamaBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)

        val detailText = intent.getStringExtra("nama ")
        val detailImg = intent.getIntExtra("image",0)

        txtDetailNamaBuah.setText(detailText)
        imgDetailBuah.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}