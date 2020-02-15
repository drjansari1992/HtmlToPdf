package com.dipen.htmltopdf

import android.app.AlertDialog
import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

/***
 * Created by Dipen Jansari on 2020-02-15
 *
 * Description :
 *
 * Copyright(c) 2020 HtmlToPdf.
 * All rights reserved.
 */
class JavaScriptInterface(context: Context) {

    private val context = context

    @JavascriptInterface
    fun showToast(msg: String) {
        Toast.makeText(this.context, " Showing $msg", Toast.LENGTH_LONG).show()
    }

    @JavascriptInterface
    fun openAlertDialog() {
        val myDialog: AlertDialog.Builder = AlertDialog.Builder(context)
        myDialog.setTitle("DANGER!")
        myDialog.setMessage("You can do what you want!")
        myDialog.setPositiveButton("ON", null)
        myDialog.show()
    }

}