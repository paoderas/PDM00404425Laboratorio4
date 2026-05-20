package com.pdm0126.pdm00404425laboratorio4.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    data object Tasks : Routes()

}