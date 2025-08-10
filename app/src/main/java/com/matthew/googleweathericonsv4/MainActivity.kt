package com.matthew.googleweathericonsv4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Handle Breezy Weather icon provider intent
        if (intent?.action == "org.breezyweather.ICON_PROVIDER") {
            handleIconProviderRequest()
            return
        }

        setContentView(R.layout.activity_main)

        // Initialize UI elements
        val titleText: TextView = findViewById(R.id.title_text)
        val descriptionText: TextView = findViewById(R.id.description_text)
        val openBreezyWeatherButton: Button = findViewById(R.id.open_breezy_weather_button)
        val githubButton: Button = findViewById(R.id.github_button)

        titleText.text = getString(R.string.app_name)
        descriptionText.text = getString(R.string.app_description)

        // Button to open Breezy Weather
        openBreezyWeatherButton.setOnClickListener {
            try {
                val intent = packageManager.getLaunchIntentForPackage("org.breezyweather")
                if (intent != null) {
                    startActivity(intent)
                } else {
                    val browserIntent = Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/breezy-weather/breezy-weather/releases"))
                    startActivity(browserIntent)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // Button to open Google Weather Icons GitHub repository
        githubButton.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://github.com/mrdarrengriffin/google-weather-icons"))
            startActivity(browserIntent)
        }
    }

    private fun handleIconProviderRequest() {
        // Return info about this icon pack to Breezy Weather
        val resultIntent = Intent()
        resultIntent.putExtra("name", getString(R.string.provider_name))
        resultIntent.putExtra("package", packageName)
        setResult(RESULT_OK, resultIntent)
        finish()
    }
}