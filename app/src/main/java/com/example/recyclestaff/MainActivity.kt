package com.example.recyclestaff

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var dataset: ArrayList<Stuff>
    private lateinit var nameList: Array<String>
    private lateinit var firstnameList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataset = arrayListOf()

        nameList = arrayOf(
            "Даниил",
            "Дмитрий",
            "Григорий",
            "Алексей",
            "Виктор",
            "Александр",
            "Владислав"
        )

        firstnameList = arrayOf(
            "Иванов",
            "Смирнов",
            "Кузнецов",
            "Попов",
            "Соколов",
            "Орлов",
            "Васильев"
        )

        recycleView = findViewById(R.id.recycle)
        recycleView.adapter = StuffAdapter(dataset)
        recycleView.layoutManager = LinearLayoutManager(this)


        buildList()
    }

    private fun buildList(){
        for (i in nameList.indices){
            val list = Stuff(nameList[i], firstnameList[i])
            dataset.add(list)
        }
    }


}