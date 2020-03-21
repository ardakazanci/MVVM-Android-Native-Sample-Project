package com.ardakazanci.androidmvvmsampleproject.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ardakazanci.androidmvvmsampleproject.data.api.ApiHelper
import com.ardakazanci.androidmvvmsampleproject.data.repository.MainRepository
import com.ardakazanci.androidmvvmsampleproject.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}