package com.laine.mauro.basicwebview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        web_view.webViewClient = WebViewClient()
        web_view.loadUrl(WEB_VIEW_URL)
    }

    override fun onBackPressed() {
        if (web_view.canGoBack()) {
            web_view.goBack()
        } else {
            super.onBackPressed()
        }
    }

    companion object {
        val WEB_VIEW_URL = "http://www.google.com"
    }
}