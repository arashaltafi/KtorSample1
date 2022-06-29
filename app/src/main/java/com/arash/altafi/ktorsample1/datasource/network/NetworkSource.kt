package com.arash.altafi.ktorsample1.datasource.network

import com.arash.altafi.ktorsample1.models.dto.UserResultDTO

interface NetworkSource {
     suspend fun getUsers(resultCount :Int ) : UserResultDTO
}