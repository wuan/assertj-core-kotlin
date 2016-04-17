# assertj-core-kotlin [![Build Status](https://travis-ci.org/wuan/assertj-core-kotlin.svg?branch=master)](https://travis-ci.org/wuan/assertj-core-kotlin) [![Coverage Status](https://coveralls.io/repos/github/wuan/assertj-core-kotlin/badge.svg?branch=master)](https://coveralls.io/github/wuan/assertj-core-kotlin?branch=master)

a thin and simple AssertJ wrapper for Kotlin

## Motivation

AssertJ ist not usable from Kotlin by default, because there are a lot of overload ambiguity compile errors.

## Usage

Just import `assertThat` from `KotlinAssertions` and most of AssertJ should work again:

```
import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.Test

class KotlinAssertionsExample {

    @Test
    fun simpleAssertion() {
        assertThat(10L.toString()).isEqualTo("10")
    }

}
```

## Disclaimer

The software is not yet a complete wrapper. Your contributions are welcome.