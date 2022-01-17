package com.example.toolbarlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.toolbarlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_menu)
        supportActionBar?.title = "salamec"
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.sync -> {Toast.makeText(this, "sync", Toast.LENGTH_SHORT).show()}
                R.id.save -> {Toast.makeText(this, "save", Toast.LENGTH_SHORT).show()}
                R.id.search -> {Toast.makeText(this, "search", Toast.LENGTH_SHORT).show()}
                R.id.delete -> {Toast.makeText(this, "delete", Toast.LENGTH_SHORT).show()}
            }
            true

        }
        binding.nv.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.sync_nav1 -> Toast.makeText(this, "sync_1", Toast.LENGTH_SHORT).show()
                R.id.sync_nav2 -> Toast.makeText(this, "sync_2", Toast.LENGTH_SHORT).show()
                R.id.save_nav1 -> Toast.makeText(this, "save_1", Toast.LENGTH_SHORT).show()
                R.id.save_nav2 -> Toast.makeText(this, "save_2", Toast.LENGTH_SHORT).show()
                R.id.search_nav1 -> Toast.makeText(this, "search_1", Toast.LENGTH_SHORT).show()
                R.id.search_nav2 -> Toast.makeText(this, "search_2", Toast.LENGTH_SHORT).show()
                R.id.delete_nav1 -> Toast.makeText(this, "delete_1", Toast.LENGTH_SHORT).show()
                R.id.delete_nav2 -> Toast.makeText(this, "delete_2", Toast.LENGTH_SHORT).show()
            }
            true
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> binding.drawer.openDrawer(GravityCompat.START)
            R.id.sync -> {Toast.makeText(this, "sync", Toast.LENGTH_SHORT).show()}
            R.id.save -> {Toast.makeText(this, "save", Toast.LENGTH_SHORT).show()}
            R.id.search -> {Toast.makeText(this, "search", Toast.LENGTH_SHORT).show()}
            R.id.delete -> {Toast.makeText(this, "delete", Toast.LENGTH_SHORT).show()}
        }
            return true
    }

}
