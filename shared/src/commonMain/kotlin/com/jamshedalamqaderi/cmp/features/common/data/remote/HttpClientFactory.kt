package com.jamshedalamqaderi.cmp.features.common.data.remote

import com.jamshedalamqaderi.cmptemplate.shared.config.BuildKonfig
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json

expect fun createHttpClient(): HttpClient

class HttpClientFactory(private val engine: HttpClientEngineFactory<HttpClientEngineConfig>) {

    fun createClient(): HttpClient {
        return HttpClient(engine) {
            install(ContentNegotiation) {
                json()
            }
            defaultRequest {
                url(BuildKonfig.HOST)
            }
        }
    }
}
