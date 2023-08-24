package com.jamshedalamqaderi.cmp.features.common.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp

actual fun createHttpClient(): HttpClient {
    return HttpClientFactory(OkHttp).createClient()
}