package com.example.justauth.data

import com.example.justauth.domain.Repository.AuthRepository
import kotlinx.coroutines.delay

class AuthRepositoryImpl: AuthRepository {

    override suspend fun login(email: String, password: String): Boolean {
        delay(1000)
        return true
    }

    override suspend fun register(email: String, password: String): Boolean {
        delay(1000)
        return true
    }
}