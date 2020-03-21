package com.ardakazanci.androidmvvmsampleproject.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}