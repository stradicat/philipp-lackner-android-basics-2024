package dev.dmayr.philliplackner_androidbasics2024

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dmayr.philliplackner_androidbasics2024.ui.theme.PhillipLacknerAndroidBasics2024Theme

class MainActivity : ComponentActivity() {

    private fun getTAG(): String = "MainActivity"

    private val viewModel by viewModels<ContactsViewModel>() // instance of ViewModel to preserve states; it will outlive the Activity lifecycle.
//    private val viewModel = ViewModelProvider(this).get(ContactsViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MainActivity", "onCreate()")

        setContent {
            PhillipLacknerAndroidBasics2024Theme {
                // A surface container using the 'background' color from the theme

//                // Jetpack Compose way:
//                val viewModel =
//                    viewModel<ContactsViewModel>(factory = object : ViewModelProvider.Factory {
//                        @Suppress("UNCHECKED_CAST")
//                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//                            return ContactsViewModel(
//                                helloWorld = "Hello, World!"
//                            ) as T
//                        }
//                    })
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Greeting("This is an Android app")

                    Button(
                        onClick = {
                            viewModel.changeBackgroundColor()
                        }, modifier = Modifier
                            .padding(4.dp)
                            .height(48.dp)
                            .width(32.dp)

                    ) {
                        Text(text = "Change Color")
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(getTAG(), "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(getTAG(), "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(getTAG(), "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(getTAG(), "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(getTAG(), "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart()")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello! $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PhillipLacknerAndroidBasics2024Theme {
        Greeting("Android")
    }
}
