package com.example.justauth.util



    fun String.containsNumber(): Boolean {
        val regex = Regex(".*\\d+.*")
        return regex.matches(this)
    }

    fun String.containsUpperCase(): Boolean {
        val regex = Regex(".*[A-Z]+.*")
        return regex.matches(this)
    }

    fun String.containsSpecialChar(): Boolean {
        val regex = Regex(".*[^A-Za-z\\d]+.*")
        return regex.matches(this)
    }

/*
([^\s]+(?=\.(jpg|gif|png))\.\2)	Matches jpg,gif or png images.
([A-Za-z0-9-]+)	Matches latter, number and hyphens.
(^[1-9]{1}$|^[1-4]{1}[0-9]{1}$|^100$)	Matches any number from 1 to 100 inclusive.
(#?([A-Fa-f0-9]){3}(([A-Fa-f0-9]){3})?)	Matches valid hexa decimal color code.
((?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})	Matches 8 to 15 character string with at least one upper case, one lower case and one digit.
(\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6})	Matches email address.
(\<(/?[^\>]+)\>)	Matches HTML tags.
 */