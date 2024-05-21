package dev.dmayr.philliplackner_androidbasics2024

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.dmayr.philliplackner_androidbasics2024.ui.theme.PhilippLacknerAndroidBasics2024Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PhilippLacknerAndroidBasics2024Theme {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
//                            // Launch a SecondActivity, as Intent
//                            Intent(applicationContext, SecondActivity::class.java).also {
//                                startActivity(it)
//                            }

                            // Launch the YouTube as an Intent
                            Intent(Intent.ACTION_MAIN).also {
                                it.`package` = "com.google.android.youtube"
                                try {
                                    startActivity(it)
                                } catch (e: ActivityNotFoundException) {
                                    Log.e("Error", "YouTube app not found")
                                    e.printStackTrace()
                                }
                            }
                        }) {
                        Text(text = "click me!")
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
    PhilippLacknerAndroidBasics2024Theme {
        Greeting("Android")
    }
}
