package com.compose.app

import kotlin.test.Test
import kotlin.test.assertEquals

class GreeterTest {

    private val greeter = Greeter()

    @Test
    fun greetWithValidNameReturnsPersonalizedGreeting() {
        // Arrange
        val name = "Alice"

        // Act
        val result = greeter.greet(name)

        // Assert
        assertEquals("Hello, Alice!", result)
    }

    @Test
    fun greetWithEmptyStringReturnsDefaultGreeting() {
        // Arrange
        val name = ""

        // Act
        val result = greeter.greet(name)

        // Assert
        assertEquals("Hello, World!", result)
    }

    @Test
    fun greetWithWhitespaceOnlyNameReturnsDefaultGreeting() {
        // Arrange
        val name = "   "

        // Act
        val result = greeter.greet(name)

        // Assert
        assertEquals("Hello, World!", result)
    }

    @Test
    fun greetTrimsLeadingAndTrailingWhitespace() {
        // Arrange
        val name = "  Bob  "

        // Act
        val result = greeter.greet(name)

        // Assert
        assertEquals("Hello, Bob!", result)
    }
}
