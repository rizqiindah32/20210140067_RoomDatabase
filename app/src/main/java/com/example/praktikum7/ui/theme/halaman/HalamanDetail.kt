package com.example.praktikum7.ui.theme.halaman

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.praktikum7.R
import com.example.praktikum7.data.Siswa
import com.example.praktikum7.model.DetailViewModel
import com.example.praktikum7.model.PenyediaViewModel
import com.example.praktikum7.navigasi.DestinasiNavigasi

object DetailsDestination : DestinasiNavigasi{
    override val route = "item_details"
    override val titleRes = R.string.detail_siswa
    const val siswaIdArg = "itemId"
    val routeWithArgs = "$route/{$siswaIdArg}"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    navigateToEditItem: (Int) -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DetailViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}
@Composable
fun ItemDetails(
    siswa: Siswa, modifier: Modifier = Modifier
){
    Card (
        modifier = modifier, colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_large)),
        ){

        }
    }
}
@Composable
private fun ItemDetailsRow(
    @StringRes labelResID: Int, itemDetail: String, modifier: Modifier = Modifier
){
    Row (modifier = modifier){
        Text(text = stringResource(labelResID))
        Spacer(modifier = Modifier.weight(1f))
        Text(text = itemDetail, fontWeight = FontWeight.Bold)
    }
}
@Composable
private fun DeleteConfirmationDialog(
    onDeleteConfirm: ()-> Unit,
    onDeleteCancel: ()-> Unit,
    modifier: Modifier = Modifier
){
    AlertDialog(onDismissRequest = { /*TODO*/ },
        title = { Text(stringResource(R.string.attention))},
        text = { Text(stringResource(R.string.delete))},
        modifier = modifier,
        dismissButton = {
            TextButton(onClick = onDeleteCancel) {
                Text(text = stringResource(R.string.no))
            }
        },
        confirmButton = {
            TextButton(onClick = onDeleteConfirm) {
                Text(text = stringResource(R.string.yes))
            }
        }
        )
}