package ru.banki.ui

import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

//    var state = MutableLiveData<Pair<State, Int>>()
//
//    fun getState(): LiveData<Pair<State, Int>> {
//        state = MutableLiveData()
//        return state
//    }
//
//    fun handleFailure(failure: Failure) {
//        when (failure) {
//            is Failure.ServerError -> state.postValue(Pair(State.SERVER_ERROR, failure.code))
//            is Failure.NetworkConnection -> state.postValue(Pair(State.NO_CONNECTION, 0))
//            else -> state.postValue(Pair(State.UNKNOWN, 0))
//        }
//    }

}