package com.tringapps.com.kotlin.utility

import java.util.regex.Pattern


class LoginValidator {
    companion object {
        val empty = ""
    }

    fun validateUsername(login: String): Boolean = login != empty

    fun validatePassword(pass: String): Boolean = pass != empty && pass.length >= 8

    fun validateEmail(emailId: String): Boolean {
        if (emailId != empty) {
            var emailPatern = "^[A-Za-z0-9-_\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
            var pattern = Pattern.compile(emailPatern, Pattern.CASE_INSENSITIVE)
            var matcher = pattern.matcher(emailId)
            return matcher.matches();
        }
        return false
    }

}