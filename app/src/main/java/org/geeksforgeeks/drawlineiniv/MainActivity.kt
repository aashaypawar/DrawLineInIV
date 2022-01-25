package org.geeksforgeeks.drawlineiniv

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mImageView = findViewById<ImageView>(R.id.image_view_1)
        val mButton = findViewById<Button>(R.id.button_1)

        val mBitmap = Bitmap.createBitmap(500, 700, Bitmap.Config.ARGB_8888)
        val mCanvas = Canvas(mBitmap)
        mCanvas.drawColor(Color.GRAY)
        mImageView.setImageBitmap(mBitmap)

        mButton.setOnClickListener {

            val mPaint = Paint()
            mPaint.color = Color.GREEN
            mPaint.style = Paint.Style.STROKE
            mPaint.strokeWidth = 10F
            mPaint.isAntiAlias = true

            val mStartX = 0F
            val mStartY = 0F
            val mStopX = mCanvas.width.toFloat()
            val mStopY = mCanvas.height.toFloat()

            mCanvas.drawLine(mStartX, mStartY, mStopX, mStopY, mPaint)

            mImageView.setImageBitmap(mBitmap)
        }
    }
}