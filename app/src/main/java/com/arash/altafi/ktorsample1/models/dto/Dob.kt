package com.arash.altafi.ktorsample1.models.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Dob(
    @SerialName("age")
    val age: Int? = null,
    @SerialName("date")
    val date: String? = null
)