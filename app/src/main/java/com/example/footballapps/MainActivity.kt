package com.example.footballapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapps.adapter.ListClubAdapter
import com.example.footballapps.model.Club

class MainActivity : AppCompatActivity() {

    private lateinit var rvClub: RecyclerView
    private var list: ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClub = findViewById(R.id.rvClub)
        rvClub.setHasFixedSize(true)

        list.addAll(ClubData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvClub.layoutManager = LinearLayoutManager(this)

        val listClubAdapter = ListClubAdapter(list)
        rvClub.adapter = listClubAdapter
    }
}
