package com.example.justauth.domain.use_case

import com.example.justauth.domain.model.RegisterInputValidationType
import org.junit.Assert.*
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class ValidateRegisterInputUseCaseTest {

    private val validateRegisterInputUseCase = ValidateRegisterInputUseCase()

    @Test
    fun `test register input with correct email and password returns valid`() {
        val result = validateRegisterInputUseCase(
            "Test@email.com", password = "ValidPassword1!$", passwordRepeated = "ValidPassword1!$"
        )
        val expected = RegisterInputValidationType.Valid
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `test register input with no email gives correct return input type`() {
        val result = validateRegisterInputUseCase(
            "Testemail.com", password = "ValidPassword1!$", passwordRepeated = "ValidPassword1!$"
        )
        val expected = RegisterInputValidationType.NoEmail
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `test register input with not matching passwords gives correct return type`() {
        val result = validateRegisterInputUseCase(
            "Test@email.com", password = "ValidPassword1$", passwordRepeated = "ValidPassword1!$"
        )
        val expected = RegisterInputValidationType.PasswordsDoNotMatch
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `test register input with upper case missing password gives correct return type`() {
        val result = validateRegisterInputUseCase(
            "Test@email.com", password = "invalidpassword1!", passwordRepeated = "invalidpassword1!"
        )
        val expected = RegisterInputValidationType.PasswordUpperCaseMissing
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `test register input with number missing password gives correct return type`() {
        val result = validateRegisterInputUseCase(
            "Test@email.com", password = "ValidPassword!%", passwordRepeated = "ValidPassword!%"
        )
        val expected = RegisterInputValidationType.PasswordNumberMissing
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `test register input with special character missing password gives correct return type`() {
        val result = validateRegisterInputUseCase(
            "Test@email.com", password = "ValidPassword1", passwordRepeated = "ValidPassword1"
        )
        val expected = RegisterInputValidationType.PasswordSpecialCharMissing
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `test register input with password too short gives correct return type`() {
        val result = validateRegisterInputUseCase(
            "Test@email.com", password = "Valid1!", passwordRepeated = "Valid1!"
        )
        val expected = RegisterInputValidationType.PasswordTooShort
        assertThat(result).isEqualTo(expected)
    }

}