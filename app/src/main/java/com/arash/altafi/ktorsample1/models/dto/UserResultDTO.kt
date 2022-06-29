package com.arash.altafi.ktorsample1.models.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep
import com.arash.altafi.ktorsample1.models.dto.Result
import com.arash.altafi.ktorsample1.models.dto.İnfo

@Keep
@Serializable
data class UserResultDTO(
    @SerialName("info")
    val info: İnfo? = null,
    @SerialName("results")
    val results: List<Result>? = null
)