package org.example

class Calculator {
    public fun add(a: Double, b: Double): Double {
        return (a + b).toDouble()
    }

    public fun subtract(a: Double, b: Double): Double {
        return (a - b).toDouble()
    }

    public fun multiply(a: Double, b: Double): Double {
        return (a * b).toDouble()
    }

    public fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw kotlin.IllegalArgumentException("Division by zero is not allowed.")
        }
        return a.toDouble() / b.toDouble()
    }
}