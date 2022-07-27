package com.project.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx: Context, attr: AttributeSet) : View(ctx, attr) {

    // Radius untuk view
    private var radius = 100f

    // Untuk memberi warna pada View
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    // 1. onFinishedInflate() -> Dipanggil setelah view dan semua turunanya berhasil di inflated dari xml
    // 2. onMeasure() -> Dipanggil untuk menentukan semua turunannya
    // 3. onLayout() -> Dipanggil ketika ukuran dan posisi untuk semua turunannya
    // 4. onSizeChanged() -> Dipanggil ketika ukuran harus melakukan render kontennya
    // 5. onDraw() -> Dipanggil ketika tampilan harus melakukan render kontennya
    // 6. onKey() -> Dipanggil ketika ada sebuah event key down baru terjadi
    // 7. onTrackballEvent() -> Dipanggil ketika terjadi gerakan pada trackball
    // 8. onTouchEvent() -> Dipanggil ketika terjadi sentuhan pada layar

}