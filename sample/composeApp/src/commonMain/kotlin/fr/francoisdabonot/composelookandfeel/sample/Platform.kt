package fr.francoisdabonot.composelookandfeel.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
