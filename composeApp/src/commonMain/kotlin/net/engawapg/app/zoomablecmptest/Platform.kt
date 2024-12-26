package net.engawapg.app.zoomablecmptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform