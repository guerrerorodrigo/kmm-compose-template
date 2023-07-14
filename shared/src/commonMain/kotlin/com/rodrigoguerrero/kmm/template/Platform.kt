package com.rodrigoguerrero.kmm.template

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform