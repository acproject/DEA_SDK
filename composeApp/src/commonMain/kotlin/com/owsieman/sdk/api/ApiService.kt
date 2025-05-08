package com.owsieman.sdk.api

import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.URLProtocol
import io.ktor.http.isSuccess
import io.ktor.http.path
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/**
 * @author acproject@qq.com
 * @date 2025/5/7 22:14
 */
class ApiService {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
        install(HttpTimeout) {
            requestTimeoutMillis = 15000    // 15s
        }
    }

    /**
     * Fetch data
     *  # 代码解释
     * 该函数 [fetchData](file://D:\workspace\java_projects\DEA_SDK\composeApp\src\commonMain\kotlin\org\owsieman\sdk\api\ApiService.kt#L31-L42) 是一个挂起函数，用于向 `http://localhost:8080/test` 发起 GET 请求。若响应状态为成功，则返回响应体文本；否则返回状态描述。
     *
     * # 控制流图
     * ```mermaid
     * flowchart TD
     *     A[开始请求] --> B[设置请求URL]
     *     B --> C[发送GET请求]
     *     C --> D{请求是否成功}
     *     D -->|是| E[返回响应文本]
     *     D -->|否| F[返回状态描述]
     * ```
     *
     * @return
     */
    suspend fun fetchData(): String {
        val result = httpClient.get {
            url {
                protocol = URLProtocol.HTTP
                host = "localhost:8080"
                path("test")
            }
        }
        return if (result.status.isSuccess()) {
            result.bodyAsText()
        } else result.status.description
    }
}