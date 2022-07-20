package com.geekorum.bugs.splashscreenwindowattributesbug

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.geekorum.bugs.splashscreenwindowattributesbug.databinding.ActivityMainBinding
import com.geekorum.bugs.splashscreenwindowattributesbug.databinding.ActivityOtherBinding
import com.google.android.material.snackbar.Snackbar

/**
 * Created by darisk on 7/20/22.
 */
class OtherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        binding = ActivityOtherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val layoutInDisplayCutoutMode = window.attributes.layoutInDisplayCutoutMode
        val layoutInDisplayCutoutModeText = when (layoutInDisplayCutoutMode) {
            WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT -> "LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT"
            WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS -> "LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS"
            WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER -> "LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER"
            WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES -> "LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES"
            else -> "UNKNOWN"
        }
        binding.content.tv2.text =  getString(R.string.windowLayoutInDisplayCutoutModeValue, layoutInDisplayCutoutModeText)
    }

}
