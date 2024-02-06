package com.example.chat

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu) // main_menu.xml dosyasını şişir
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_profile -> {
                // Profil öğesine tıklandığında yapılacak işlemler buraya gelir
               
                true
            }
            R.id.action_home -> {
                // Ana sayfa öğesine tıklandığında yapılacak işlemler buraya gelir
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
