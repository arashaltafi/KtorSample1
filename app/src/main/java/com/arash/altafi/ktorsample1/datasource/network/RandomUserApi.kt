package com.arash.altafi.ktorsample1.datasource.network

import com.arash.altafi.ktorsample1.models.dto.UserResultDTO
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*

private const val BaseUrl: String = "https://randomuser.me/api"

class RandomUserApi : NetworkSource {

    private val client by lazy {
        HttpClient(Android) {
            install(JsonFeature) {
                serializer = GsonSerializer()
            }
        }
    }

    fun <R> useClient(block: (HttpClient) -> R) = client.use {
        block(it)
    }

    override suspend fun getUsers(resultCount :Int ): UserResultDTO {
        return client.get(
             urlString = "$BaseUrl/?results=$resultCount"
         )
    }
}