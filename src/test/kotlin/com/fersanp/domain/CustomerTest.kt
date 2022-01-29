package com.fersanp.domain

import br.com.six2six.fixturefactory.Fixture
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader
import com.fersanp.fixtures.CustomerTemplate
import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class CustomerTest {

    init {
        FixtureFactoryLoader.loadTemplates(CustomerTemplate::class.java.packageName);
    }

    @Test
    fun `test generate a customer instance`() {
       val customer: Customer = Fixture.from(Customer::class.java).gimme("default")
        assertNotNull(customer)
    }
}