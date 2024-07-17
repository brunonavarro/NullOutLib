package com.bruno.daniel.navarro.nunez.nullout.entities

import com.bruno.daniel.navarro.nunez.decoradorlib.decoradores.NullOutEntity
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.WithDefault

@NullOutEntity
data class User(
    var username: String? = null,
    val password: String? = null,
    val rol: Rol? = null,
    val categories: List<Category>? = null
): WithDefault

@NullOutEntity
data class Rol(
    val type: String? = null,
    var name: String? = null,
    var numberPermission: Int? = null
): WithDefault

@NullOutEntity
data class Category(
    val name: String? = null,
    val rating: Int? = null
): WithDefault


