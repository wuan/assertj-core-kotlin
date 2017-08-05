/*

   Copyright 2016 Andreas Würl

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.assertj.core.api

import java.math.BigInteger

object KotlinAssertions {

    fun assertThat(str: String): AbstractCharSequenceAssert<*, String> = StringAssert(str)

    fun assertThat(actual: Byte): AbstractByteAssert<*> = ByteAssert(actual)
    fun assertThat(actual: ByteArray): AbstractByteArrayAssert<*> = ByteArrayAssert(actual)

    fun assertThat(actual: Short): AbstractShortAssert<*> = ShortAssert(actual)
    fun assertThat(actual: ShortArray): AbstractShortArrayAssert<*> = ShortArrayAssert(actual)

    fun assertThat(actual: Int): AbstractIntegerAssert<*> = IntegerAssert(actual)
    fun assertThat(actual: IntArray): AbstractIntArrayAssert<*> = IntArrayAssert(actual)

    fun assertThat(actual: Long): AbstractLongAssert<*> = LongAssert(actual)
    fun assertThat(actual: LongArray): AbstractLongArrayAssert<*> = LongArrayAssert(actual)

    fun assertThat(actual: Float): AbstractFloatAssert<*> = FloatAssert(actual)
    fun assertThat(actual: FloatArray): AbstractFloatArrayAssert<*> = FloatArrayAssert(actual)

    fun assertThat(actual: Double): AbstractDoubleAssert<*> = DoubleAssert(actual)
    fun assertThat(actual: DoubleArray): AbstractDoubleArrayAssert<*> = DoubleArrayAssert(actual)

    fun assertThat(actual: Boolean): AbstractBooleanAssert<*> = BooleanAssert(actual)
    fun assertThat(actual: BooleanArray): AbstractBooleanArrayAssert<*> = BooleanArrayAssert(actual)

    fun assertThat(actual: BigInteger): AbstractBigIntegerAssert<*> = BigIntegerAssert(actual)

    fun <T> assertThat(actual: Iterable<T>) = IterableAssert(actual)
    fun <T> assertThat(actual: Iterator<T>) = IterableAssert(actual)
    fun <T> assertThat(actual: Sequence<T>) = IterableAssert(actual.iterator())

    fun <K, V> assertThat(actual: Map<K, V>) = MapAssert(actual)

    fun <T> assertThat(actual: T): AbstractObjectAssert<*, T> = ObjectAssert(actual)
}