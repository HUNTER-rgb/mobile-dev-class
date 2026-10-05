package com.example.mobile_dev_class

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun tenantSummary_containsAllTenantDetails() {
        val tenant = Tenant("John Kamau", "0712345678", "25000")

        assertEquals(
            "Tenant: John Kamau\nPhone: 0712345678\nRent paid: KSh 25000",
            tenant.summary()
        )
    }
}
