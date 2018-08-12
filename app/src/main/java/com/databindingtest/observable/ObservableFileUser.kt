package com.databindingtest.observable

import android.databinding.ObservableField
import android.databinding.ObservableInt

class ObservableFileUser {
    var firstName = ObservableField<String>()
    var lastName = ObservableField<String>()
    val age = ObservableInt()
}