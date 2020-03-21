package com.ardakazanci.androidmvvmsampleproject.data.api

import com.ardakazanci.androidmvvmsampleproject.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}