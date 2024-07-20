# NullOut -> Una biblioteca Kotlin para minimizar los nulos en el desarrollo de software :pushpin:

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![](https://jitpack.io/v/brunonavarro/NullOutLib.svg)](https://jitpack.io/#brunonavarro/NullOutLib)
![GitHub all releases](https://img.shields.io/github/downloads/brunonavarro/NullOutLib/total)
![GitHub release (by tag)](https://img.shields.io/github/downloads/brunonavarro/NullOutLib/1.0.0-beta1/total)


[![issues](https://img.shields.io/github/issues/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/issues)
[![pull requests](https://img.shields.io/github/issues-pr/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/pulls)
[![contributors](https://img.shields.io/github/contributors/brunonavarro/NullOutLib?style=for-the-badge)](https://github.com/brunonavarro/NullOutLib/graphs/contributors)

## :loudspeaker: **We'd love to hear from you! Provide feedback [Here](https://github.com/brunonavarro/NullOutLib/issues/new?assignees=brunonavarro&labels=feedback&projects=&template=feedback-libreria-NullOutLib.md&title=%5BFEEDBACK%5D)** :point_left: :loudspeaker:


## :blue_book: **Get started with NullOut - full docs [Here](https://brunonavarro.github.io/NullOutLib/docs/)** :point_left: :blue_book:

> [!warning]
> These generic functions should not be implemented for attributes of data classes that at least do not initialize their attributes to null, for example:
>
> ## 🟥 Not Compatible 🔴
> ```kotlin
> data class User(
>   val userName: String,
>   val password: String
> )
> ```
> ## 🟩 Compatible 🟢
> ```kotlin
> data class User(
>   val userName: String? =null,
>   val password: String? =null
> )
> ```
> ### The following interface must be implemented in all data classes:
> ```kotlin
> interface WithDefault
> ```
> ### In addition, the following annotation must be added as well:
> ```kotlin
> annotation NullOutEntity
> ```
> ### Resulting in the data class:
> ```kotlin
> @NullOutEntity
> data class User(
>   val userName: String? =null,
>   val password: String? =null
> ): WithDefault
> ```
> ### Recommendations for use in refactors:
> The name `getOrDefault()` applies only to `Primitive, Object, or Any` data types. In case you need `getOrDefault()` for the types `List, Array, ArrayList, Pair, Map, MutableList, Sequence, Iterable`, or similar. Use the get + TYPE + OrDefault() function.
>
> '**Example:**
>
> > for type `List` use `getListOrDefault()` or for type `Pair` use `getPairOrDefault()`
>
> In cases of refactoring, do not use the functions offered by **NullOutLib** where you declare `'?.apply{}'` , `'?.let{}'`, `'?.run{}'` and in whose block logic there are no more validation conditions or `setter()` or `add()` methods are called.

## 👨‍💻 :pill: Quick start: :rocket: :rocket: :rocket:

In project gradle add the following lines:

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

in app gradle add the following lines:

```gradle
plugins{
  id("com.google.devtools.ksp")
}
...
dependencies {
  implementation("com.github.brunonavarro:DecoratorNullOut:1.0.0-beta5")
  implementation("com.github.brunonavarro:NullOutLib:1.0.0-beta1")
  ksp("com.github.brunonavarro:ProcessorNullOutLib:1.0.0-beta2")
}
```
