package com.example.firstapplication

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
        val nextActivity_btn = findViewById<Button>(R.id.btn_nextActivity)    //画面のボタン
        nextActivity_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, ColorActivity::class.java)
            //次のActivity実行
            startActivity(nextIntent)
        }
        val web_btn = findViewById<Button>(R.id.btn_web)    //画面のボタン
        web_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, WebviewActivity::class.java)
            //次のActivity実行
            startActivity(nextIntent)
        }
        val browser_btn = findViewById<Button>(R.id.btn_browser)    //画面のボタン
        browser_btn.setOnClickListener {
            //外部ブラウザ　browser_url
            val url: String = getString(R.string.browser_url)
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    startActivity(intent)
        }
    }
}