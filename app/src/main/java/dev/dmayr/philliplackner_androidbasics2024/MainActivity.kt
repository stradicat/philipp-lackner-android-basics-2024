package dev.dmayr.philliplackner_androidbasics2024

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.dmayr.philliplackner_androidbasics2024.ui.theme.PhillipLacknerAndroidBasics2024Theme

// 2.- passing Context allows the class to interact with Android OS components
class MyClass(private val context: Context)

class MainActivity : ComponentActivity() {

    // 4.- Let's create an instance of a ViewModel
    private val myViewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1.- Context: middleman between an app and Android OS components
        // e.g. database, filesystem, camera, providers in general

//        val myContext: Context = this
//        // 'this' refers to this instance of MainActivity
        // 3.- Each Context has a specific lifetime, depending on where it was declared.
//        myViewModel.context = this

//        4.- Calling the Context on the current activity:
        this.applicationContext

        setContent {
            PhillipLacknerAndroidBasics2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("This is an Android app")

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
