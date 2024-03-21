package dev.dmayr.philliplackner_androidbasics2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.dmayr.philliplackner_androidbasics2024.ui.theme.PhillipLacknerAndroidBasics2024Theme

class MainActivity : ComponentActivity() {

//    private val viewModel by viewModels<ContactsViewModel>() // instance of ViewModel to preserve states; it will outlive the Activity lifecycle.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        print("onCreate()")

        setContent {
            PhillipLacknerAndroidBasics2024Theme {
                // A surface container using the 'background' color from the theme

                val viewModel = viewModel<ContactsViewModel>(
                    factory = object : ViewModelProvider.Factory {
                        @Suppress("UNCHECKED_CAST")
                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
                            return ContactsViewModel(
                                helloWorld = "Hello, World!"
                            ) as T
                        }
                    }
                )
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
                    color = viewModel.backgroundColor
                ) {
                    Greeting("This is an Android app")

                    Button(
                        onClick = {
                            viewModel.changeBackgroundColor()
                        }, modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Text(text = "Change Color")
                    }
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart()")
    }

    override fun onResume() {
        super.onResume()
        println("onResume()")
    }

    override fun onPause() {
        super.onPause()
        println("onPause()")
    }

    override fun onStop() {
        super.onStop()
        println("onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy()")
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
