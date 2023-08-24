package com.jamshedalamqaderi.cmp.features.common.domain.actuals

enum class Platform {
    ANDROID, IOS
}

expect fun getPlatform(): Platform
