package com.bruno.daniel.navarro.nunez.nullout.entities

import com.bruno.daniel.navarro.nunez.decoradorlib.decoradores.NullOutEntity
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.WithDefault

//import com.bruno.daniel.navarro.nunez.decoradorlib.decoradores.NullOutEntity
//import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.WithDefault


@NullOutEntity
data class User(
    val username: String? = null,
    val password: String? = null
): WithDefault


