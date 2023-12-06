package com.example.praktikum7.ui.theme.halaman

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = siswa.nama,
                style = MaterialTheme.typography.titleLarge,
                )
            Spacer(Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                )
            Text(
                text = siswa.telpon,
                style = MaterialTheme.typography.titleMedium
            )
        }
        Text(
            text = siswa.alamat,
            style = MaterialTheme.typography.titleMedium
        )
    }
}