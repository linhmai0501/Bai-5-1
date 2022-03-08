package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapte.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mydataset = Datasource().loadAffirmations()
        val RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        RecyclerView.adapter = ItemAdapter(this,mydataset)
        RecyclerView.setHasFixedSize(true)
    }
}