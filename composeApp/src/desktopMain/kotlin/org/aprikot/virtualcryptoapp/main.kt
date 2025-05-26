package org.aprikot.virtualcryptoapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Virtual Crypto App",
    ) {
        App()
    }
}