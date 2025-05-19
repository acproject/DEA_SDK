package com.owsieman.sdk.api.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val status: String,
    val data:String,
    val message: String? = null
)