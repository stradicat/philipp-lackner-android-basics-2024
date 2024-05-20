package dev.dmayr.philliplackner_androidbasics2024

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    // Static field leak!
    // This ViewModel's lifecycle will outlive the lifecycle of the activity it's invoked on.

    // It's best NOT to store Context information outside the Activity, or any component with an different lifecycle than the Activity, as it can't be controlled.

//    var context: Context? = null
}
