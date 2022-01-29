package com.fersanp.domain

import com.fersanp.utils.NoArg

@NoArg
data class Address(val street: String, val city: String, val state: String, val zipCode: String, val country: String)
