package com.example.justauth.domain.Repository

interface AuthRepository {

    suspend fun login(email: String, password: String): Boolean

    suspend fun register(email: String, password: String): Boolean
}