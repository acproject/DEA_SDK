package com.owsieman.sdk.core.config

import com.russhwolf.settings.Settings
import com.russhwolf.settings.get
import com.russhwolf.settings.set
import kotlinx.serialization.encodeToString
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

/**
 * 配置管理器，负责SDKConfig的持久化
 */
class ConfigManager(private val settings: Settings) {
    companion object {
        private const val KEY_CONFIG = "dea_sdk_config"
        private val json = Json { ignoreUnknownKeys = true }
    }
    
    /**
     * 保存配置
     */
    fun saveConfig(config: SDKConfig) {
        val configJson = json.encodeToString(config)
        settings[KEY_CONFIG] = configJson
    }
    
    /**
     * 加载配置
     */
    fun loadConfig(): SDKConfig? {
        val configJson = settings.getStringOrNull(KEY_CONFIG) ?: return null
        return try {
            json.decodeFromString<SDKConfig>(configJson)
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * 清除配置
     */
    fun clearConfig() {
        settings.remove(KEY_CONFIG)
    }
}