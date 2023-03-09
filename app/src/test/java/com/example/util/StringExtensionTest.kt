package com.example.util

import com.example.justauth.util.containsNumber
import com.example.justauth.util.containsSpecialChar
import com.example.justauth.util.containsUpperCase
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class StringExtensionTest {

    @Test
    fun `test string contains no number returns false when check for it`() {

        val result = "NoNumber".containsNumber()
        assertThat(result).isFalse()
    }

    @Test
    fun `test string contains a number returns true when check for it`() {

        val result = "12331".containsNumber()
        assertThat(result).isTrue()
    }

    @Test
    fun `test string contains no upper case returns false when check for it`() {

        val result = "nouppercase".containsUpperCase()
        assertThat(result).isFalse()
    }

    @Test
    fun `test string contains an upper case returns true when check for it`() {

        val result = "upperCase".containsUpperCase()
        assertThat(result).isTrue()
    }

    @Test
    fun `test string contains no special char returns false when check for it`() {

        val result = "SpecialChar".containsSpecialChar()
        assertThat(result).isFalse()
    }

    @Test
    fun `test string contains a special char returns true when check for it`() {

        val result = "SpecialChar!".containsSpecialChar()
        assertThat(result).isTrue()
    }
}

