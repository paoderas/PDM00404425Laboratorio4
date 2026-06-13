package com.pdm0126.pdm00404425laboratorio4.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.pdm00404425laboratorio4.screens.GeneralViewModel
import com.pdm0126.pdm00404425laboratorio4.screens.TaskScreen


@Composable
fun AppNavigation() {

    val backStack = remember {
        mutableStateListOf<Routes>(Routes.Tasks)
    }

    val viewModel: GeneralViewModel = viewModel()

    NavDisplay(

        backStack = backStack,

        onBack = {
            if (backStack.size > 1) {
                backStack.removeAt(backStack.lastIndex)
            }
        },

        entryProvider = entryProvider {

            entry<Routes.Tasks> {

                TaskScreen(
                    viewModel = viewModel
                )

            }

        }

    )
}