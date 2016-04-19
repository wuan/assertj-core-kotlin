package org.assertj.core.api

import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.Test

class KotlinAssertionsExample {

    @Test
    fun simpleAssertion() {
        assertThat(10L.toString()).isEqualTo("10")
    }

}
