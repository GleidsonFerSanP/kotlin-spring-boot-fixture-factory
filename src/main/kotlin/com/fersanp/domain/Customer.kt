package com.fersanp.domain

import com.fersanp.utils.NoArg
import java.time.LocalDate

@NoArg
data class Customer(val name: String, val email: String, val birthday: LocalDate, val age: Int, val address: Address)
