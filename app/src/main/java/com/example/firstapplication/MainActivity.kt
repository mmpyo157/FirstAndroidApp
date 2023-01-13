package com.example.firstapplication

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//次回は正しいブランチに画面実装を入れる
        val nextActivity_btn = findViewById<Button>(R.id.btn_nextActivity)    //画面のボタン「次の画面へ」
        nextActivity_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, ColorActivity::class.java)
            //次のActivity実行
            startActivity(nextIntent)
        }
        val web_btn = findViewById<Button>(R.id.btn_web)    //画面のボタン「WEB」
        web_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, WebviewActivity::class.java)
            //次のActivity実行
            startActivity(nextIntent)
        }
        val browser_btn = findViewById<Button>(R.id.btn_browser)    //画面のボタン「外部ブラウザへ」
        browser_btn.setOnClickListener {
            //外部ブラウザ　browser_url
            val url: String = getString(R.string.browser_url)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val dialog_btn = findViewById<Button>(R.id.btn_dialog)    //画面のボタン「ダイアログ」
        dialog_btn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage(R.string.dialog_start_game)
                .setPositiveButton(R.string.start,
                    DialogInterface.OnClickListener { dialog, id ->
                        // START THE GAME!
                        //Intentオブジェクト生成、遷移画面定義
                        val nextIntent = Intent(this, ColorActivity::class.java)
                        //次のActivity実行
                        startActivity(nextIntent)
                    })
                .setNegativeButton(R.string.cancel,
                    DialogInterface.OnClickListener { dialog, id ->
                        // User cancelled the dialog
                    })
                // Create the AlertDialog object and return it
                .show()
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}