package com.example.praktikum7

import android.app.Application
import com.example.praktikum7.repositori.ContainerApp
import com.example.praktikum7.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}