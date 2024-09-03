package ru.banki.ui.reviewinapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ReviewInAppViewModel : ViewModel() {

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