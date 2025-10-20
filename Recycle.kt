package com.example.widget
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Recycle : AppCompatActivity() {

    private lateinit var rvDrivers: RecyclerView
    private lateinit var adapter: DriverAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycleview)

        rvDrivers = findViewById(R.id.rvDrivers)
        rvDrivers.layoutManager = LinearLayoutManager(this)

        val drivers = listOf(
            Driver("Max Verstappen", R.drawable.max, R.drawable.redbull),
            Driver("Lewis Hamilton", R.drawable.lewis, R.drawable.mercy),
            Driver("George Russel", R.drawable.gorge, R.drawable.ferrari),
            Driver("Lando Norris", R.drawable.lando, R.drawable.mclaren)
        )

        adapter = DriverAdapter(drivers)
        rvDrivers.adapter = adapter
    }
}
