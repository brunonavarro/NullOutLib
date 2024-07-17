package com.bruno.daniel.navarro.nunez.nullout.cases

import com.bruno.daniel.navarro.nunez.nullout.Examples
import com.bruno.daniel.navarro.nunez.nullout.entities.User
import com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util.getOrDefault
import org.junit.Assert
import org.junit.Before
import org.junit.Test

internal class OneExampleTest {

    lateinit var exampleClass: Examples

    @Before
    fun setUp() {
        exampleClass = Examples()
    }

    @Test
    fun example_one_with_out_NullOut_functions() {
        val valor1: String? = exampleClass.exampleOneWithOutNullOut()
        Assert.assertEquals(null, valor1)
    }

    @Test
    fun example_one_with_NullOut_functions() {
        val valor1: String = exampleClass.exampleOneWithNullOut()
        Assert.assertNotEquals(null, valor1)
    }

}