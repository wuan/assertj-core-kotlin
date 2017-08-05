package org.assertj.core.api

import org.assertj.core.api.KotlinAssertions.assertThat
import org.junit.Test
import java.math.BigDecimal
import java.math.BigInteger

class KotlinAssertionsTest {
    @Test
    fun shouldCreateBooleanAssert() {
        assertThat(assertThat(true)).isNotNull().isInstanceOf(AbstractBooleanAssert::class.java)
    }

    @Test
    fun shouldCreateBooleanArrayAssert() {
        assertThat(assertThat(BooleanArray(0))).isNotNull().isInstanceOf(AbstractBooleanArrayAssert::class.java)
    }

    @Test
    fun shouldCreateByteAssert() {
        assertThat(assertThat(1.toByte())).isNotNull().isInstanceOf(AbstractByteAssert::class.java)
    }

    @Test
    fun shouldCreateByteArrayAssert() {
        assertThat(assertThat(ByteArray(1))).isNotNull().isInstanceOf(AbstractByteArrayAssert::class.java)
    }

    @Test
    fun shouldCreateShortAssert() {
        assertThat(assertThat(1.toShort())).isNotNull().isInstanceOf(AbstractShortAssert::class.java)
    }

    @Test
    fun shouldCreateShortArrayAssert() {
        assertThat(assertThat(ShortArray(1))).isNotNull().isInstanceOf(AbstractShortArrayAssert::class.java)
    }

    @Test
    fun shouldCreateIntAssert() {
        assertThat(assertThat(1)).isNotNull().isInstanceOf(AbstractIntegerAssert::class.java)
    }

    @Test
    fun shouldCreateIntArrayAssert() {
        assertThat(assertThat(IntArray(0))).isNotNull().isInstanceOf(AbstractIntArrayAssert::class.java)
    }

    @Test
    fun shouldCreateLongAssert() {
        assertThat(assertThat(1L)).isNotNull().isInstanceOf(AbstractLongAssert::class.java)
    }

    @Test
    fun shouldCreateLongArrayAssert() {
        assertThat(assertThat(LongArray(1))).isNotNull().isInstanceOf(AbstractLongArrayAssert::class.java)
    }

    @Test
    fun shouldCreateFloatAssert() {
        assertThat(assertThat(1.0f)).isNotNull().isInstanceOf(AbstractFloatAssert::class.java)
    }

    @Test
    fun shouldCreateFloatArrayAssert() {
        assertThat(assertThat(FloatArray(0))).isNotNull().isInstanceOf(AbstractFloatArrayAssert::class.java)
    }

    @Test
    fun shouldCreateDoubleAssert() {
        assertThat(assertThat(1.0)).isNotNull().isInstanceOf(AbstractDoubleAssert::class.java)
    }

    @Test
    fun shouldCreateDoubleArrayAssert() {
        assertThat(assertThat(DoubleArray(0))).isNotNull().isInstanceOf(AbstractDoubleArrayAssert::class.java)
    }

    @Test
    fun shouldCreateIterableAssert() {
        assertThat(assertThat(listOf("1", "2", "3"))).isNotNull().isInstanceOf(AbstractIterableAssert::class.java)
    }

    @Test
    fun shouldCreateIteratorAssert() {
        assertThat(assertThat(object : Iterator<String> {
            override fun hasNext(): Boolean {
                throw UnsupportedOperationException()
            }

            override fun next(): String {
                throw UnsupportedOperationException()
            }
        })).isNotNull().isInstanceOf(AbstractIterableAssert::class.java)
    }

    @Test
    fun shouldCreateSequenceAssert() {
        assertThat(assertThat(listOf("1", "2").asSequence())).isNotNull().isInstanceOf(AbstractIterableAssert::class.java)
    }

    @Test
    fun shouldCreateMapAssert() {
        assertThat(assertThat(mapOf(Pair("key", "value")))).isNotNull().isInstanceOf(MapAssert::class.java)
    }

    @Test
    fun shouldCreateStringAssert() {
        assertThat(assertThat("foo")).isNotNull().isInstanceOf(AbstractCharSequenceAssert::class.java)
    }

    @Test
    fun shouldCreateBigIntegerAssert() {
        assertThat(assertThat(BigInteger.ONE)).isNotNull().isInstanceOf(AbstractBigIntegerAssert::class.java)
    }

    @Test
    fun shouldCreateBigDecimalAssert() {
        assertThat(assertThat(BigDecimal.ONE)).isNotNull().isInstanceOf(AbstractBigDecimalAssert::class.java)
    }

}