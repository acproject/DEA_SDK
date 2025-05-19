package com.owsieman.sdk

/**
 * 这是一个入口文件
 */

import com.owsieman.sdk.api.ApiService
import com.owsieman.sdk.core.config.SDKConfig

class DeaSDK private constructor(private val config: SDKConfig) {
    private val apiService = ApiService(config)

    companion object {
        private var instance: DeaSDK? = null

        fun getInstance(config: SDKConfig): DeaSDK {
            if (instance == null) {
                instance = DeaSDK(config)
            }
            return instance!!
        }

        fun getInstance(): DeaSDK {
            return instance ?: throw IllegalArgumentException("DeaSDK not initialized")
        }
    }

    // SDK公开的API方法
    suspend fun fetchData(): String {
        return apiService.fetchData()
    }

    // todo 更多的API方法
}