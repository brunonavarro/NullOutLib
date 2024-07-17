package com.bruno.daniel.navarro.nunez.nullout.cases

import com.bruno.daniel.navarro.nunez.nullout.Examples
import com.bruno.daniel.navarro.nunez.nullout.entities.Rol
import com.bruno.daniel.navarro.nunez.nullout.entities.User
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getOrDefault
import org.junit.Assert
import org.junit.Before
import org.junit.Test

internal class ThreeExampleTest {

    lateinit var exampleClass: Examples

    @Before
    fun setUp() {
        exampleClass = Examples()
    }

    @Test
    fun example_three_with_out_NullOut_functions() {
        val objetoPrincipal = User()
        val valor1 = exampleClass.exampleThreeWithOutNullOut(objetoPrincipal)
        Assert.assertEquals(null, valor1)
    }

    @Test
    fun example_three_with_NullOut_functions() {
        val objetoPrincipal = User()
        val valor1 = exampleClass.exampleThreeWithNullOut(objetoPrincipal)
        Assert.assertNotEquals(null, valor1)
    }

}