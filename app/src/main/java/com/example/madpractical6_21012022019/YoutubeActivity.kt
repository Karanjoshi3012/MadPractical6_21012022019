package com.example.madpractical6_21012022019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val myWebView = findViewById<WebView>(R.id.my_web_view)
        val btnFloatingButton=findViewById<FloatingActionButton>(R.id.btn_floating)
        val youtubrId="XQS7JkQmlx8"
        val webSettings:WebSettings=myWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        myWebView.loadUrl("https://www.youtube.com/embed/"+youtubrId)

        btnFloatingButton.setOnClickListener {
            Intent(this,MainActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}