package dilanduman.kotlindeneme

import junit.framework.Assert.fail
import org.junit.Test

class MainKtTest {

    @Test
    fun test_sample_1() {
        println("Test 1 run")
    }

    @Test
    fun test_sample_2() {
        fail("Test failed.")
    }
}