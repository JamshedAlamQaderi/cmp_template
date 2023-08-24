package com.jamshedalamqaderi.cmp.features.common.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin

actual fun createHttpClient(): HttpClient {
    return HttpClientFactory(Darwin).createClient()
}
