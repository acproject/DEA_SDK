package com.owsieman.sdk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform