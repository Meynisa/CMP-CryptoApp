package org.aprikot.virtualcryptoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform