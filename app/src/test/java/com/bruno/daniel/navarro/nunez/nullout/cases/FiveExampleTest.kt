package com.bruno.daniel.navarro.nunez.nullout.cases

import com.bruno.daniel.navarro.nunez.nullout.Examples
import com.bruno.daniel.navarro.nunez.nullout.entities.Category
import com.bruno.daniel.navarro.nunez.nullout.entities.Rol
import com.bruno.daniel.navarro.nunez.nullout.entities.User
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.firstOrDefault
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getOrDefault
import org.junit.Assert
import org.junit.Before
import org.junit.Test

internal class FiveExampleTest {

    lateinit var exampleClass: Examples

    @Before
    fun setUp() {
        exampleClass = Examples()
    }

    @Test
    fun example_five_with_out_NullOut_functions() {
        val objetoPrincipal = User()
        val valor1 = exampleClass.exampleFiveWithOutNullOut(objetoPrincipal)
        Assert.assertEquals(null, valor1)
    }

    @Test
    fun example_five_with_NullOut_functions_01() {
        val objetoPrincipal = User()
        val valor1 = exampleClass.exampleFiveWithNullOut01(objetoPrincipal)
        Assert.assertNotEquals(null, valor1)
    }

    @Test
    fun example_five_with_NullOut_functions_02() {
        val objetoPrincipal = User()
        val valor1 = exampleClass.exampleFiveWithNullOut02(objetoPrincipal)
        Assert.assertNotEquals(null, valor1)
    }

}