package com.example.malculator

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


lateinit var buttonsms:Button
lateinit var buttonemail:Button
lateinit var buttoncall:Button
lateinit var buttoncamera:Button
lateinit var buttonmpesa:Button
lateinit var buttonshare:Button
lateinit var buttondial:Button


class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        buttonsms=findViewById(R.id.Btn_Sms)
        buttonemail=findViewById(R.id.Btn_Email)
        buttoncall=findViewById(R.id.Btn_Call)
        buttoncamera=findViewById(R.id.Btn_Camera)
        buttonmpesa=findViewById(R.id.Btn_Mpesa)
        buttonshare=findViewById(R.id.Btn_Share)
        buttondial=findViewById(R.id.Btn_Dial)



        buttonsms.setOnClickListener {

            val uri = Uri.parse("smsto:0759554770")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "Welcome to my world")

            startActivity(intent)
        }
        buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        buttoncamera.setOnClickListener {
            val takePicture = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePicture, 1)
        }
        buttoncall.setOnClickListener {
            ActivityCompat.requestPermissions(
                this@IntentActivity,
                arrayOf(Manifest.permission.CALL_PHONE),
                1
            )
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

            if (ContextCompat.checkSelfPermission(
                    this@IntentActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
            } else {
                startActivity(intent)
            }
        }
        buttonmpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }
        buttonshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)

        }
        buttondial.setOnClickListener {

            val phone = "0798457690"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }


    }
}