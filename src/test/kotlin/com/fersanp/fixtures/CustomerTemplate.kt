package com.fersanp.fixtures

import br.com.six2six.fixturefactory.Fixture
import br.com.six2six.fixturefactory.Rule
import br.com.six2six.fixturefactory.loader.TemplateLoader
import com.fersanp.domain.Address
import com.fersanp.domain.Customer
import java.time.LocalDate


class CustomerTemplate: TemplateLoader {
    override fun load() {
        Fixture.of(Customer::class.java).addTemplate("default", object : Rule() {
            init {
                add("name", random("Anderson Parra", "Arthur Hirata"))
                add("email", "\${name}@gmail.com")
                add("birthday", LocalDate.of(1979, 7,29))
                add("age", 1)
                add("address", one(Address::class.java, "default"))
            }
        })

        Fixture.of(Address::class.java).addTemplate("default", object : Rule() {
            init {
                add("street", random("Paulista Avenue", "Ibirapuera Avenue"))
                add("city", "São Paulo")
                add("state", "\${city}")
                add("country", "Brazil")
                add("zipCode", random("06608000", "17720000"))
            }
        })
    }
}