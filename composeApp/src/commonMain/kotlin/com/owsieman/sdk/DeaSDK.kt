package com.owsieman.sdk

import com.owsieman.sdk.api.ApiService
import com.owsieman.sdk.core.config.ConfigManager
import com.owsieman.sdk.core.config.SDKConfig
import com.russhwolf.settings.Settings

class DeaSDK private constructor(private val config: SDKConfig, private val configManager: ConfigManager) {
    private val apiService = ApiService(config)

    init {
        // 初始化时保存配置
        configManager.saveConfig(config)
    }

    companion object {
        private var instance: DeaSDK? = null

        /**
         * 使用新配置初始化SDK
         */
        fun initialize(config: SDKConfig, settings: Settings): DeaSDK {
            val configManager = ConfigManager(settings)
            instance = DeaSDK(config, configManager)
            return instance!!
        }

        /**
         * 尝试使用持久化的配置初始化SDK
         * 如果没有持久化的配置，则返回null
         */
        fun initializeFromSaved(settings: Settings): DeaSDK? {
            val configManager = ConfigManager(settings)
            val savedConfig = configManager.loadConfig() ?: return null
            instance = DeaSDK(savedConfig, configManager)
            return instance
        }

        /**
         * 获取SDK实例
         * 如果SDK未初始化，则抛出异常
         */
        fun getInstance(): DeaSDK {
            return instance ?: throw IllegalArgumentException("DeaSDK not initialized")
        }
    }

    /**
     * 更新配置
     */
    fun updateConfig(config: SDKConfig): DeaSDK {
        instance = DeaSDK(config, configManager)
        return instance!!
    }

    /**
     * 清除持久化的配置
     */
    fun clearSavedConfig() {
        configManager.clearConfig()
    }

    // SDK公开的API方法
    suspend fun fetchData(): String {
        return apiService.fetchData()
    }

    // todo 更多的API方法
}