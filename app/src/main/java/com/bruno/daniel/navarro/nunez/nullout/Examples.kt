package com.bruno.daniel.navarro.nunez.nullout

import com.bruno.daniel.navarro.nunez.nullout.entities.Category
import com.bruno.daniel.navarro.nunez.nullout.entities.Rol
import com.bruno.daniel.navarro.nunez.nullout.entities.User
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.firstOrDefault
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getListOrDefault
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getOrDefault

class Examples {


    fun exampleOneWithOutNullOut(): String? {
        val user = User()
        val valor1: String? = user.rol?.name
        return valor1
    }

    fun exampleOneWithNullOut(): String {
        val user = User()
        val valor1: String? = user.rol.getOrDefault().name
        return valor1.getOrDefault()
    }

    fun exampleTwoWithOutNullOut(objetoPrincipal: User): Int? {
        val user = User()
        val valorObjeto1: Rol? = user.rol

        valorObjeto1?.let {
            if ((it.numberPermission ?: 0) > 0){
                objetoPrincipal.rol?.numberPermission = it.numberPermission
            }
        }
        return objetoPrincipal.rol?.numberPermission
    }

    fun exampleTwoWithNullOut(objetoPrincipal: User): Int {
        val user = User()
        val valorObjeto1: Rol = user.rol.getOrDefault()

        valorObjeto1.let {
            if ((it.numberPermission ?: 0) > 0){
                objetoPrincipal.rol.getOrDefault().numberPermission = it.numberPermission
            }
        }

        return objetoPrincipal.rol?.numberPermission.getOrDefault()
    }


    fun exampleThreeWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: Rol? = user.rol

        valorObjeto1?.let {
            objetoPrincipal.username = it.name
        }
        return objetoPrincipal.username
    }

    fun exampleThreeWithNullOut(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: Rol? = user.rol

        valorObjeto1?.let {
            objetoPrincipal.rol.getOrDefault().numberPermission = it.numberPermission
        }

        return objetoPrincipal.username.getOrDefault()
    }


    fun exampleFourWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.firstOrNull()?.let {
            objetoPrincipal.rol?.name = it.name
        }

        return objetoPrincipal.rol?.name
    }

    fun exampleFourWithNullOut(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.firstOrNull()?.let {
            objetoPrincipal.rol.getOrDefault().name = it.name
        }

        return objetoPrincipal.username.getOrDefault()
    }




    fun exampleFiveWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.firstOrNull()?.let {
            if ((it.rating ?: 0) > 0) {
                objetoPrincipal.rol?.name = it.name
            }
        }

        return objetoPrincipal.rol?.name
    }

    fun exampleFiveWithNullOut01(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.firstOrDefault().let {
            if ((it.rating ?: 0) > 0) {
                objetoPrincipal.rol.getOrDefault().name = it.name
            }
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }

    fun exampleFiveWithNullOut02(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.firstOrDefault().let {
            if ((it.rating.getOrDefault()) > 0) {
                objetoPrincipal.rol.getOrDefault().name = it.name
            }
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }



    fun exampleSixWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.find { (it.rating ?: 0) > 0 }?.let {
            objetoPrincipal.rol?.name = it.name
        }

        return objetoPrincipal.rol.getOrDefault().name
    }

    fun exampleSixWithNullOut01(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { (it.rating ?: 0) > 0 }?.let {
            objetoPrincipal.rol.getOrDefault().name = it.name
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }

    fun exampleSixWithNullOut02(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { it.rating.getOrDefault() > 0 }?.let {
            objetoPrincipal.rol.getOrDefault().name = it.name
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }


    fun exampleSevenWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.find { (it.rating ?: 0) > 0 }?.name?.let {
            objetoPrincipal.rol?.name = it
        }

        return objetoPrincipal.rol.getOrDefault().name
    }

    fun exampleSevenWithNullOut01(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { (it.rating ?: 0) > 0 }.getOrDefault().name?.let {
            objetoPrincipal.rol.getOrDefault().name = it
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }

    fun exampleSevenWithNullOut02(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { it.rating.getOrDefault() > 0 }.getOrDefault().name?.let {
            objetoPrincipal.rol.getOrDefault().name = it
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }


}