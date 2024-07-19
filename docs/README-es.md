# NullOut -> Una biblioteca Kotlin para minimizar los nulos en el desarrollo de software :pushpin:

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![](https://jitpack.io/v/brunonavarro/NullOutLib.svg)](https://jitpack.io/#brunonavarro/NullOutLib)
![GitHub all releases](https://img.shields.io/github/downloads/brunonavarro/NullOutLib/total)
![GitHub release (by tag)](https://img.shields.io/github/downloads/brunonavarro/NullOutLib/1.0.0-beta1/total)


[![issues](https://img.shields.io/github/issues/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/issues)
[![pull requests](https://img.shields.io/github/issues-pr/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/pulls)
[![contributors](https://img.shields.io/github/contributors/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/graphs/contributors)

## :loudspeaker: **¡Nos encantaría conocer tu opinión! Proporciona feedback [Aquí](https://github.com/brunonavarro/NullOutLib/issues/new?assignees=brunonavarro&labels=feedback&projects=&template=feedback-libreria-NullOutLib.md&title=%5BFEEDBACK%5D)** :point_left: :loudspeaker:


## :blue_book: **Comience con NullOut: documentos completos [Aquí](https://brunonavarro.github.io/NullOutLib/docs/)** :point_left: :blue_book:

> [!warning]
> No se debe implementar estas funciones genericas para atributos de data clases que almenos no inicializan sus atributos en null por ejemplo:
> 
> ## 🟥 No Compatible 🔴
> ```kotlin
> data class User(
>    val userName: String,
>    val password: String
> )
> ```
> ## 🟩 Compatible 🟢
> ```kotlin
> data class User(
>    val userName: String? = null,
>    val password: String? = null
> )
> ```
> ### En todas las data class debe implementarse la siguiente interfaz:
> ```kotlin
> interface WithDefault
> ```
> ### Ademas se debe agregar la siguiente anotacion tambien:
> ```kotlin
> annotation NullOutEntity
> ```
> ### Teniendo como resultado en las data class:
> ```kotlin
> @NullOutEntity
> data class User(
>    val userName: String? = null,
>    val password: String? = null
> ): WithDefault
> ```

## 👨‍💻 :pill: Inicio rapido: :rocket: :rocket: :rocket:

En gradle de proyecto agregar las siguientes lineas:

```gradle
plugins {
   id("com.google.devtools.ksp") version "KotlinVersion-VersionKSP" apply false
}

buildscript {
    repositories {
        ...
        maven(url = "https://jitpack.io")
    }
    ...
}
```

en gradle de app agregar las siguientes lineas:

```gradle
plugins{
	id("com.google.devtools.ksp")
}
...
dependecies {
	implementation("com.github.brunonavarro:DecoradorNullOut:1.0.0-beta5")
	implementation("com.github.brunonavarro:NullOutLib:1.0.0-beta1")
	ksp("com.github.brunonavarro:ProcesadorNullOutLib:1.0.0-beta2")
}
```







