package com.project.customview

import android.content.Context
import android.graphics.PointF
import android.util.AttributeSet
import android.view.View

private enum class FanSpeed(val label: Int) {
    OFF(R.string.fan_off),
    LOW(R.string.low),
    MEDIUM(R.string.medium),
    HIGH(R.string.high);
}

private const val RADIUS_OFFSET_LABEL = 30
private const val RADIUS_OFFSET_INDICATOR = -35

class DialView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var radius = 0.0f
    private var fanSpeed = FanSpeed.OFF

    private val pointPosition: PointF = PointF(0.0f, 0.0f)

}
