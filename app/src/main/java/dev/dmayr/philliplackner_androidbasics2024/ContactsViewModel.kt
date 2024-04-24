package dev.dmayr.philliplackner_androidbasics2024

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactsViewModel : ViewModel() { // store state between configuration changes
    var backgroundColor by mutableStateOf(Color.White)
        private set // UI can read property but not set/write it

    fun changeBackgroundColor() {
        backgroundColor = Color.DarkGray
    }
}
