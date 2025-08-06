import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        // Case 1: 2 + 3 = 5
        val a1 = 2.0
        val b1 = 3.0
        val result1 = calculator.add(a1, b1)
        assertEquals(5.0, result1)

        // Case 2: -2 + 2 = 0
        val a2 = -2.0
        val b2 = 2.0
        val result2 = calculator.add(a2, b2)
        assertEquals(0.0, result2)

        // Case 3: -2 + (-3) = -5
        val a3 = -2.0
        val b3 = -3.0
        val result3 = calculator.add(a3, b3)
        assertEquals(-5.0, result3)

        // Case 4: 999999.0 + 1 = 1000000.0
        val a4 = 999999.0
        val b4 = 1.0
        val result4 = calculator.add(a4, b4)
        assertEquals(1000000.0, result4)
    }


    @Test
    fun testSubtraction() {
        // Case 1: 2 - 3 = -1
        val a1 = 2.0
        val b1 = 3.0
        val result1 = calculator.subtract(a1, b1)
        assertEquals(-1.0, result1)

        // Case 2: -2 - 2 = -4
        val a2 = -2.0
        val b2 = 2.0
        val result2 = calculator.subtract(a2, b2)
        assertEquals(-4.0, result2)

        // Case 3: -2 - (-3) = 1
        val a3 = -2.0
        val b3 = -3.0
        val result3 = calculator.subtract(a3, b3)
        assertEquals(1.0, result3)

        // Case 4: 5 - 5 = 0
        val a4 = 5.0
        val b4 = 5.0
        val result4 = calculator.subtract(a4, b4)
        assertEquals(0.0, result4)
    }

    @Test
    fun testMultiplication() {
        // Case 1: 2 * 3 = 6
        val a1 = 2.0
        val b1 = 3.0
        val result1 = calculator.multiply(a1, b1)
        assertEquals(6.0, result1)

        // Case 2: -2 * 2 = -4
        val a2 = -2.0
        val b2 = 2.0
        val result2 = calculator.multiply(a2, b2)
        assertEquals(-4.0, result2)

        // Case 3: -2 * -3 = 6
        val a3 = -2.0
        val b3 = -3.0
        val result3 = calculator.multiply(a3, b3)
        assertEquals(6.0, result3)

        // Case 4: 0 * 5 = 0
        val a4 = 0.0
        val b4 = 5.0
        val result4 = calculator.multiply(a4, b4)
        assertEquals(0.0, result4)
    }


    @Test
    fun testErrorCases() {
        // Case 1: 5 * 5 = 0
        val numerator2 = 5.0
        val denominator2 = 5.0
        val result1 =  calculator.divide(numerator2, denominator2)
        assertEquals(1.0, result1)

        // Case 2: 5 / 0 = Undefined
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(5.0, 0.0)
        }
        assertEquals("Division by zero is not allowed.", exception.message)
    }

}