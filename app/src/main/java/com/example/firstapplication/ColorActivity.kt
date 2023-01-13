package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

private lateinit var mMap: GoogleMap

class ColorActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityColorBinding
    private lateinit var latlng: LatLng

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)

            binding = ActivityColorBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
            mapFragment.getMapAsync(this)
        //val apiKey = "AIzaSyBGUeL7ZKOMml6FaOZQ0IUu3L_022iIhtY"
//        val map_btn = findViewById<Button>(R.id.btn_map)    //画面のボタン「MAP API」
//        map_btn.setOnClickListener {
//            val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
//            mapFragment?.getMapAsync(this)
////            val mapFragment = supportFragmentManager
////                .findFragmentById(R.id.btn_map) as SupportMapFragment
////            mapFragment.getMapAsync(this)
//        }
    }
//マップ表示はされたがマーカーは置かれない　12/15
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

//Activityのbindingができない　1/13 ColorActivityのAndroid nameが怪しい
}

