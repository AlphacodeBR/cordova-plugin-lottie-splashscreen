package de.dustplanet.cordova.lottie

import androidx.annotation.ColorInt
import androidx.annotation.Size
import androidx.core.graphics.toColorInt

class ColorHelper {
    companion object {
        const val LOG_TAG = "ColorHelper"
    }
}

@ColorInt
fun ColorHelper.Companion.parseColor(
    @Size(min = 1) colorString: String,
): Int {
    return try {
      colorString.toColorInt()
    } catch (e: IllegalArgumentException) {
      // fallback para branco
      "#ffffff".toColorInt()
    }
}
