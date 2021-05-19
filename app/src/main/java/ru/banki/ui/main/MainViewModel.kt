package ru.banki.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.banki.ui.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(

) : BaseViewModel() {

    private var feedbackLiveData = MutableLiveData<String>()

    fun feedback(): LiveData<String> {
        feedbackLiveData = MutableLiveData()
        return feedbackLiveData
    }

    fun doFeedback() {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

}