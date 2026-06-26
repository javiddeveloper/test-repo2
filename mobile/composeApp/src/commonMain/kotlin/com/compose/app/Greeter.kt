package com.compose.app

class Greeter {
    fun greet(name: String): String {
        val trimmed = name.trim()
        return if (trimmed.isEmpty()) "Hello, World!" else "Hello, $trimmed!"
    }
}
