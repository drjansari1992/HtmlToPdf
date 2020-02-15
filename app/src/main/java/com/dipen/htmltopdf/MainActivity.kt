package com.dipen.htmltopdf

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = "Hello How are you ?"
        //webView.loadUrl("file:///android_asset/theme9_sample.html")


        webview.settings.javaScriptEnabled = true
        webview.addJavascriptInterface(JavaScriptInterface(this), "AndroidFunction")
        webview.webChromeClient = WebChromeClient()//not in scope of this gist
        webview.loadUrl("file:///android_asset/jsobj.html")
        webview.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, weburl: String) {
                webview.loadUrl("javascript:callName(\"Dipen Jansari\")")
                webview.loadUrl("javascript:callAddress(\"Banglore\")")
            }
        }

        sendmsg.setOnClickListener {
            val msgToSend = msg.text.trim()
            webview.loadUrl("javascript:callFromActivity(\"$msgToSend\")")
        }
    }

}
