package com.bruno.daniel.navarro.nunez.nullout

import com.bruno.daniel.navarro.nunez.nullout.entities.Category
import com.bruno.daniel.navarro.nunez.nullout.entities.Rol
import com.bruno.daniel.navarro.nunez.nullout.entities.User
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.firstOrDefault
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getListOrDefault
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getOrDefault

class Examples {

    /**
     * Example 01 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valor1 sea un atributo de tipo primitivo
     * ([Any], [String], [Int], [Double], [Float], [Long])
     * se debe dejar que admita nulo.
     * **/
    fun exampleOneWithOutNullOut(): String? {
        val user = User()
        val valor1: String? = user.rol?.name
        return valor1
    }

    /**
     * Example 01 - With NullOut
     * @author BrunoNavarro
     *
     * Siempre que valor1 sea un atributo de tipo primitivo
     * ([Any], [String], [Int], [Double], [Float], [Long])
     * se debe dejar que admita nulo.
     * **/
    fun exampleOneWithNullOut(): String {
        val user = User()
        val valor1: String? = user.rol.getOrDefault().name
        return valor1.getOrDefault()
    }

    /**
     * Example 02 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorObjeto1 sea un objeto, luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, etc),
     * y en su interior exista una estructura condicional.
     * No se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
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

    /**
     * Example 02 - With NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorObjeto1 sea un objeto, luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, etc),
     * y en su interior exista una estructura condicional.
     * No se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
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

    /**
     * Example 03 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorObjeto1 sea un objeto, luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, etc),
     * y en su interior no exista una estructura condicional.
     * Se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
    fun exampleThreeWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: Rol? = user.rol

        valorObjeto1?.let {
            objetoPrincipal.username = it.name
        }
        return objetoPrincipal.username
    }

    /**
     * Example 03 - With NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorObjeto1 sea un objeto, luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, etc),
     * y en su interior no exista una estructura condicional.
     * Se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
    fun exampleThreeWithNullOut(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: Rol? = user.rol

        valorObjeto1?.let {
            objetoPrincipal.rol.getOrDefault().numberPermission = it.numberPermission
        }

        return objetoPrincipal.username.getOrDefault()
    }

    /**
     * Example 04 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * y en su interior no exista una estructura condicional.
     * Se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
    fun exampleFourWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.firstOrNull()?.let {
            objetoPrincipal.rol?.name = it.name
        }

        return objetoPrincipal.rol?.name
    }

    /**
     * Example 04 - With NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * y en su interior no exista una estructura condicional.
     * Se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
    fun exampleFourWithNullOut(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.firstOrNull()?.let {
            objetoPrincipal.rol.getOrDefault().name = it.name
        }

        return objetoPrincipal.username.getOrDefault()
    }



    /**
     * Example 05 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * y en su interior exista una estructura condicional.
     * No se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
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

    /**
     * Example 05 - With NullOut 01
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * y en su interior exista una estructura condicional.
     * No se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
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

    /**
     * Example 05 - With NullOut 02
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * y en su interior exista una estructura condicional.
     * No se debe dejar que admita nulo, y en el interior de la
     * estructura condicional seguir el ejemplo 1.
     * **/
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


    /**
     * Example 06 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * , si en su interior no existe una estructura condicional y
     * previo al ‘?.let{}’ se haga uso del ‘?.find{}’ sin despues acceder
     * a algun atributo.
     * Se debe dejar que admita nulo, y en el interior del ‘?.let{}’ seguir el ejemplo 1.
     * Adicional si se observa lo siguiente: el uso de ‘?.find{}’,
     * reemplazarlo por ‘.getOrDefault().find{}’
     *
     * **/
    fun exampleSixWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.find { (it.rating ?: 0) > 0 }?.let {
            objetoPrincipal.rol?.name = it.name
        }

        return objetoPrincipal.rol.getOrDefault().name
    }

    /**
     * Example 06 - With NullOut 01
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * , si en su interior no existe una estructura condicional y
     * previo al ‘?.let{}’ se haga uso del ‘?.find{}’ sin despues acceder
     * a algun atributo.
     * Se debe dejar que admita nulo, y en el interior del ‘?.let{}’ seguir el ejemplo 1.
     * Adicional si se observa lo siguiente: el uso de ‘?.find{}’,
     * reemplazarlo por ‘.getOrDefault().find{}’
     *
     * **/
    fun exampleSixWithNullOut01(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { (it.rating ?: 0) > 0 }?.let {
            objetoPrincipal.rol.getOrDefault().name = it.name
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }

    /**
     * Example 06 - With NullOut 02
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * , si en su interior no existe una estructura condicional y
     * previo al ‘?.let{}’ se haga uso del ‘?.find{}’ sin despues acceder
     * a algun atributo.
     * Se debe dejar que admita nulo, y en el interior del ‘?.let{}’ seguir el ejemplo 1.
     * Adicional si se observa lo siguiente: el uso de ‘?.find{}’,
     * reemplazarlo por ‘.getOrDefault().find{}’
     *
     * **/
    fun exampleSixWithNullOut02(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { it.rating.getOrDefault() > 0 }?.let {
            objetoPrincipal.rol.getOrDefault().name = it.name
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }

    /**
     * Example 07 - With Out NullOut
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * , si en su interior no existe una estructura condicional y previo al ‘?.let{}’
     * se haga uso del ‘?.find{}’ sin despues acceder a algun atributo.
     * Se debe dejar que admita nulo, y en el interior del ‘?.let{}’ seguir el ejemplo 1.
     *
     * Adicional si se observa lo siguiente: el uso de ‘?.find{}’, reemplazarlo por
     * ‘.getOrDefault().find{}.getOrDefault()’
     *
     * **/
    fun exampleSevenWithOutNullOut(objetoPrincipal: User): String? {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1?.find { (it.rating ?: 0) > 0 }?.name?.let {
            objetoPrincipal.rol?.name = it
        }

        return objetoPrincipal.rol.getOrDefault().name
    }

    /**
     * Example 07 - With NullOut 01
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * , si en su interior no existe una estructura condicional y previo al ‘?.let{}’
     * se haga uso del ‘?.find{}’ sin despues acceder a algun atributo.
     * Se debe dejar que admita nulo, y en el interior del ‘?.let{}’ seguir el ejemplo 1.
     *
     * Adicional si se observa lo siguiente: el uso de ‘?.find{}’, reemplazarlo por
     * ‘.getOrDefault().find{}.getOrDefault()’
     *
     * **/
    fun exampleSevenWithNullOut01(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { (it.rating ?: 0) > 0 }.getOrDefault().name?.let {
            objetoPrincipal.rol.getOrDefault().name = it
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }

    /**
     * Example 07 - With NullOut 02
     * @author BrunoNavarro
     *
     * Siempre que valorLista1 sea una lista, y luego se use
     * (‘?.let{}’, ‘?.apply{}’, ‘?.run{}’, ‘?.forEach{}’, ‘?.map{}’ , etc),
     * , si en su interior no existe una estructura condicional y previo al ‘?.let{}’
     * se haga uso del ‘?.find{}’ sin despues acceder a algun atributo.
     * Se debe dejar que admita nulo, y en el interior del ‘?.let{}’ seguir el ejemplo 1.
     *
     * Adicional si se observa lo siguiente: el uso de ‘?.find{}’, reemplazarlo por
     * ‘.getOrDefault().find{}.getOrDefault()’
     *
     * **/
    fun exampleSevenWithNullOut02(objetoPrincipal: User): String {
        val user = User()
        val valorObjeto1: List<Category>? = user.categories

        valorObjeto1.getListOrDefault().find { it.rating.getOrDefault() > 0 }.getOrDefault().name?.let {
            objetoPrincipal.rol.getOrDefault().name = it
        }

        return objetoPrincipal.rol.getOrDefault().name.getOrDefault()
    }


}