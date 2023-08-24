package com.jamshedalamqaderi.cmp

import com.jamshedalamqaderi.cmp.features.common.data.remote.createHttpClient
import org.koin.core.module.Module
import org.koin.dsl.module

expect val KoinPlatformModule: Module

val KoinCommonModule = module {
    single { createHttpClient() }
    // Define more dependencies
}
