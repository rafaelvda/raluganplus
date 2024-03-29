package com.ralugan.raluganplus.ui.download

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DownloadViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Vos téléchargements apparaîtront ici."
    }
    val text: LiveData<String> = _text
}