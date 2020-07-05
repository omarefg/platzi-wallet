package com.cristianvillamil.platziwallet.ui.home.data

data class UserResponse (
    val id: String,
    val token: String,
    val name: String,
    val userPhotoUrl: String,
    val transferToken: String
)