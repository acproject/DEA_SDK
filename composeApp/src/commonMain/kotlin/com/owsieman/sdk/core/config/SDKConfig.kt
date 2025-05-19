package com.owsieman.sdk.core.config

import kotlinx.serialization.Serializable

@Serializable
data class SDKConfig(
    val baseUrl: String,
    val apiKey: String,        //项目API密钥
    val storageType: String,
    val seaweedFsMaster: String?,
    val seaweedFsVolumn: String?,
    val seaweedFsServers: List<String>?,
    val ossBucket: String?,
    val ossEndpoint: String?,
    val ossAccessKeyId: String?,
    val realm:String,
    val projectId:String,
    val suUserId:String,
    val platformType:String,
    val timeout: Long = 15000,
    val debug: Boolean? = false
)