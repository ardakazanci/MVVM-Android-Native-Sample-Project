package com.ardakazanci.androidmvvmsampleproject.data.repository

import com.ardakazanci.androidmvvmsampleproject.data.api.ApiHelper
import com.ardakazanci.androidmvvmsampleproject.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}