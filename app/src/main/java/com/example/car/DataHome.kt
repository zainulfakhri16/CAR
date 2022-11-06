package com.example.car

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

    @Parcelize
    data class DataHome(
        var judul: String,
        var photos: Int
    ): Parcelable