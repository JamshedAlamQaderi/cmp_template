package com.jamshedalamqaderi.cmp.features.common.domain.services.navigation



interface NavigationService {
    fun goBack()
    fun push(router: NavigationRouter)
}