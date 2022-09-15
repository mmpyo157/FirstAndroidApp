package com.example.firstapplication

import android.content.Intent
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
            //Intentオブジェクトにテキストの内容をプットする
//            nextIntent.putExtra("main_tv", main_tv.text.toString())
            //次のActivity実行
            startActivity(nextIntent)
        }

        val web_btn = findViewById<Button>(R.id.btn_web)    //画面のボタン
        web_btn.setOnClickListener {
            //Intentオブジェクト生成、遷移画面定義
            val nextIntent = Intent(this, WebviewActivity::class.java)
            //Intentオブジェクトにテキストの内容をプットする
//            nextIntent.putExtra("main_tv", main_tv.text.toString())
            //次のActivity実行
            startActivity(nextIntent)

        }
    }
}