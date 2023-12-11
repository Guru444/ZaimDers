package com.egitim.zaimders.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.egitim.zaimders.R
import com.egitim.zaimders.adapter.DepremListesiAdapter
import com.egitim.zaimders.databinding.ActivityDepremListesiBinding
import com.egitim.zaimders.viewmodel.DepremListViewModel

class DepremListesiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDepremListesiBinding
    private val depremListesiAdapter = DepremListesiAdapter()

    private lateinit var viewModel: DepremListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDepremListesiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(DepremListViewModel::class.java)

        viewModel.getDepremList()

        binding.apply {
            rvDepremList.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
            rvDepremList.adapter = depremListesiAdapter



        }

        viewModel.getDepremList.observe(this){
            it?.let {
                depremListesiAdapter.setDepremListesi(it.result)
            }
        }

    }
}