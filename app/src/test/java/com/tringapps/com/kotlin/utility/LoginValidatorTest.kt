package com.tringapps.com.kotlin.utility

import org.junit.Test

import org.junit.Assert.*


class LoginValidatorTest {
    private val objectValidate = LoginValidator()
    @Test
    fun validatePassword() {
        assertFalse(objectValidate.validateUsername(""))
        assertTrue(objectValidate.validateUsername("hgdfhsgjds"))
        assertFalse(objectValidate.validatePassword("gdfh"))
        assertFalse(objectValidate.validatePassword(""))
        assertTrue(objectValidate.validatePassword("kjhfdjkshkj"))
    }

    @Test
    fun validateEmail() {
        assertFalse(objectValidate.validateEmail(""))
        assertTrue(objectValidate.validateEmail("name@email.com"))
        assertTrue(objectValidate.validateEmail("name@email.co.uk"))
        assertTrue(objectValidate.validateEmail("hsvd.hjfg@email.com"))
        assertTrue(objectValidate.validateEmail("h_k_gdfhjh@email.com"))
        assertFalse(objectValidate.validateEmail("name@email"))
        assertFalse(objectValidate.validateEmail("name@email..com"))
        assertFalse(objectValidate.validateEmail("@email.com"))
        assertTrue(objectValidate.validateEmail("_hsvd@email.com"))
        assertFalse(objectValidate.validateEmail(".hsvd@email.com"))
        assertFalse(objectValidate.validateEmail("hsvd@.email.com"))
    }
}