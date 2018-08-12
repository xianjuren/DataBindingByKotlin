package com.databindingtest.observable

import android.databinding.BaseObservable
import android.databinding.Bindable


class ObservableUser : BaseObservable() {


    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            // notifyPropertyChanged(BR.firstName)
        }

    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            //notifyPropertyChanged(BR.lastName)
        }

}