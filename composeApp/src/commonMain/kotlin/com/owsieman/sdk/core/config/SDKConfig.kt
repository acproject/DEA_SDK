package com.owsieman.sdk.core.config

data class SDKConfig(
    val baseUrl: String,
    val apiKey: String,
    val timeout: Long = 15000,
    val debug: Boolean = false
)