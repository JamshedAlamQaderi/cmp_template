package com.jamshedalamqaderi.cmp.features.home.presentation

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.jamshedalamqaderi.cmp.features.common.domain.actuals.getPlatform
import com.jamshedalamqaderi.cmp.features.common.presentation.Center
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = getViewModel(
        true,
        viewModelFactory { HomeScreenViewModel() })
) {
    Scaffold {
        Center {
            Text("Home Screen : ${getPlatform()}")
        }
    }
}