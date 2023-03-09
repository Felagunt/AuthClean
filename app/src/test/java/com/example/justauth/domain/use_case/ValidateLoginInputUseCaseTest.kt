package com.example.justauth.domain.use_case

import com.example.justauth.domain.model.LoginInputValidationType
import org.junit.Assert.*
import org.junit.Test

class ValidateLoginInputUseCaseTest {

    private val validateLoginInputUseCase = ValidateLoginInputUseCase()

    @Test
    fun `test empty email field returns validation type empty field`() {
        val actual = validateLoginInputUseCase(email = "", password = "password")
        val expected = LoginInputValidationType.EmptyField
        //assertThat(result).isEqualTo(LoginInputValidationType.EmptyField)
        assertEquals(expected, actual)
    }

    @Test
    fun `test empty password field returns validation type empty field`() {
        val actual = validateLoginInputUseCase(email = "dda@fld.ceo", password = "")
        val expected = LoginInputValidationType.EmptyField
        assertEquals(expected, actual)
    }

    @Test
    fun `test no email returns validation type no email`() {
        val actual = validateLoginInputUseCase(email = "hoodcoock.ceo", password = "password")
        val expected = LoginInputValidationType.NoEmail
        assertEquals(expected, actual)
    }

    @Test
    fun `test everything is correct returns validation type valid`() {
        val actual = validateLoginInputUseCase(email = "hood@coock.ceo", password = "password")
        val expected = LoginInputValidationType.Valid
        assertEquals(expected, actual)
    }
}