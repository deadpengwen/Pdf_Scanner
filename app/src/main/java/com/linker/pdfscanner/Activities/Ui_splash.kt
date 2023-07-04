package com.linker.pdfscanner.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.linker.pdfscanner.R

class Ui_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ui_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@Ui_splash, Ui_main::class.java)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            startActivity(intent)
            finish()
        }, 2500)

    }

}