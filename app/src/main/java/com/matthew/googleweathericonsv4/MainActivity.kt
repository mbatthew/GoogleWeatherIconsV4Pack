package com.matthew.googleweathericonsv4

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleIconProviderRequest()
    }

    private fun handleIconProviderRequest() {
        val resultIntent = Intent()
        resultIntent.putExtra("name", getString(R.string.provider_name))
        resultIntent.putExtra("package", packageName)
        setResult(RESULT_OK, resultIntent)
        finish()
    }
}