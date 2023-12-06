package com.example.praktikum7.ui.theme.halaman

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum7.data.Siswa

@Composable
fun DataSiswa(
    siswa: Siswa,
    modifier: Modifier = Modifier
){
    Card (
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ){

    }
}