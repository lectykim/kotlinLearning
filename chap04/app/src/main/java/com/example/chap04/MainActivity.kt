package com.example.chap04

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chap04.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    private val binding get() = mBinding!!





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val data:MutableList<Memo> = loadData()

        var adapter = CustomAdapter()
        adapter.listData=data
        recyclerView.adapter=adapter
        recyclerView.layoutManager = LinearLayoutManager(this)





        }
    private fun loadData(): MutableList<Memo>{
        val data: MutableList<Memo> = mutableListOf()
        for(no in 1..100){
            val title = "이것이 코틀린 안드로이드다.${no+1}"
            val date = System.currentTimeMillis()
            var memo = Memo(no,title,date)
            data.add(memo)
        }
        return data


    }






    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}


