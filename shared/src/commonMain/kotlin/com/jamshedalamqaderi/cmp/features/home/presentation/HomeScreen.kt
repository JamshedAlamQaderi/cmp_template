package com.jamshedalamqaderi.cmp.features.home.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.cmp.features.common.domain.actuals.getPlatform
import com.jamshedalamqaderi.cmp.features.common.domain.constants.AppStrings
import com.jamshedalamqaderi.cmp.features.common.presentation.Center
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val viewModel: HomeScreenViewModel = getViewModel(
        true,
        viewModelFactory { HomeScreenViewModel() }
    )
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(AppStrings.home)
            })
        }
    ) {
        Center {
            Text("Home Screen : ${getPlatform()}")
        }
    }
}
