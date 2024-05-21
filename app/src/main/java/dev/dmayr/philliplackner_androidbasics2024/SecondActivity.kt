package dev.dmayr.philliplackner_androidbasics2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import dev.dmayr.philliplackner_androidbasics2024.ui.theme.PhilippLacknerAndroidBasics2024Theme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PhilippLacknerAndroidBasics2024Theme {
                Text(text = "Second Activity!")
            }
        }
    }
}
