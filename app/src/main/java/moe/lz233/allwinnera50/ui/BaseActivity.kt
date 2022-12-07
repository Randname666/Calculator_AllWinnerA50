package moe.lz233.allwinnera50.ui

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat

abstract class BaseActivity : Activity() {
    lateinit var rootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootView = findViewById(android.R.id.content)
        //adapt status bar
        val mode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        if (mode == Configuration.UI_MODE_NIGHT_NO) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
        }
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(newBase)
    }
}