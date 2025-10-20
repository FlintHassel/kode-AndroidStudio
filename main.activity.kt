package com.example.widget

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {
    var listViewNama: ListView? = null
    var textViewNama: TextView? = null
    var namaOrang: Array<String?> = arrayOf<String?>(
        "Oscar Piastri",
        "Lando Norris",
        "Max Verstappen",
        "George Russell",
        "Charles Leclerc",
        "Lewis Hamilton",
        "Andrea Kimi Antonelli",
        "Alexander Albon",
        "Nico Hülkenberg",
        "Isack Hadjar",
        "Carlos Sainz Jr.",
        "Fernando Alonso",
        "Lance Stroll",
        "Liam Lawson",
        "Esteban Ocon",
        "Pierre Gasly",
        "Franco Colapinto",
        "Jack Doohan",
        "Yuki Tsunoda",
        "Gabriel Bortoleto"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview)

        listViewNama = findViewById<ListView?>(R.id.listViewNama)
        textViewNama = findViewById<TextView?>(R.id.textViewNama)

        val adapter = ArrayAdapter<String?>(
            this,
            android.R.layout.simple_list_item_1, namaOrang
        )
        listViewNama!!.setAdapter(adapter)

        listViewNama!!.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val namaDipilih = namaOrang[position]
                textViewNama!!.setText("Kamu memilih: " + namaDipilih)
            }
        })
    }
}
