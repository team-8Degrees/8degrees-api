package com.jimmy.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
