package com.bruno.daniel.navarro.nunez.nulloutlib.procesador.util

import kotlin.Pair
import kotlin.collections.Map



//@NotNull
//data class User(
//    val userName: String? = null,
//    val password: String? = null
//): WithDefault

annotation class NotNull

interface WithDefault



/**
 * @author BrunoNavarro
 * <br><h1>Functions getValueNotNull</h1><br>
 * <br><h2>FOR: TYPE PRIMITIVE</h2><br>
 * Show all function for primitive variable [Pair]
 * @see [String.getValueNotNull]
 * @see [Int.getValueNotNull]
 * @see [Double.getValueNotNull]
 * @see [Boolean.getValueNotNull]
 * @see [Pair.getValueNotNull]
 * @see [Map.getValueNotNull]
 * **/

/**
 * @author BrunoNavarro
 * <br><h2>String?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [String].
 * @param default is a default value of type String.
 * @return the data type [String], with 2 value options,
 * when it is not originally null, and if it does not call the function [String.getValueNotNull] with the default parameter
 * **/
fun String?.getOrDefault(default: String? = null): String {
    return this.getValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Int?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Int].
 * @param default is a default value of type String.
 * @return the data type [Int], with 2 value options,
 * when it is not originally null, and if it does not call the function [Int.getValueNotNull] with the default parameter
 * **/
fun Int?.getOrDefault(default: Int? = null): Int {
    return this.getValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Number?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Number].
 * @param default is a default value of type String.
 * @return the data type [Number], with 2 value options,
 * when it is not originally null, and if it does not call the function [Number.getValueNotNull] with the default parameter
 * **/
fun Number?.getOrDefault(default: Number? = null): Number {
    return this.getValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Double?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Double].
 * @param default is a default value of type String.
 * @return the data type [Double], with 2 value options,
 * when it is not originally null, and if it does not call the function [Double.getValueNotNull] with the default parameter
 * **/
fun Double?.getOrDefault(default: Double? = null): Double {
    return this.getValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Boolean?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Boolean].
 * @param default is a default value of type String.
 * @return the data type [Boolean], with 2 value options,
 * when it is not originally null, and if it does not call the function [Boolean.getValueNotNull] with the default parameter
 * **/
fun Boolean?.getOrDefault(default: Boolean? = null): Boolean {
    return this.getValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>T?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @return the data type [T], with 2 value options,
 * when it is not originally null, and if it does not call the function [getObject] with the default parameter
 * **/
@JvmName("getOrDefaultTWithDefault")
inline fun <reified T> T?.getOrDefault(): T where T: WithDefault {
    return this ?: run {
        createObject()
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>T?.getOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @return the data type [T], with 2 value options,
 * when it is not originally null, and if it does not call the function [createObject] with the default parameter
 * **/
@JvmName("getOrDefaultTAny")
inline fun <reified T> T?.getOrDefault(): T where T: Any {
    return this ?: run {
        if (T::class == List::class) {
            (this as List<*>).getListOrDefault() as T
        } else {
            createObject()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [WithDefault] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 2 value options,
 * when it is not originally null, and if it does not call the function [Pair.getPairValueNotNull] with the default parameter
 * **/
@JvmName("invokePairWithDefault")
inline fun <reified A, reified B> Pair<A, B>?.getPairOrDefault(
    default: Pair<A, B>? = null
): Pair<A, B> where A: WithDefault, B: WithDefault {
    return this.getPairValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [Any] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 2 value options,
 * when it is not originally null, and if it does not call the function [Pair.getPairValueNotNull] with the default parameter
 * **/
@JvmName("invokePairAny")
inline fun <reified A, reified B> Pair<A, B>?.getPairOrDefault(
    default: Pair<A, B>? = null
): Pair<A, B> where B : Any, A : Any {
    return this.getPairValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [WithDefault] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 2 value options,
 * when it is not originally null, and if it does not call the function [Pair.getPairValueNotNull] with the default parameter
 * **/
@JvmName("invokePairWithDefaultNull")
inline fun <reified A, reified B> Pair<A, B?>?.getPairOrDefault(
    default: Pair<A, B?>? = null
): Pair<A, B> where A: WithDefault, B: WithDefault {
    return this.getPairValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [Any] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 2 value options,
 * when it is not originally null, and if it does not call the function [Pair.getPairValueNotNull] with the default parameter
 * **/
@JvmName("invokePairAnyNull")
inline fun <reified A, reified B> Pair<A, B?>?.getPairOrDefault(
    default: Pair<A, B?>? = null
): Pair<A, B> where A : Any, B : Any {
    return this.getPairValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [Any] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 2 value options,
 * when it is not originally null, and if it does not call the function [Pair.getPairValueNotNull] with the default parameter
 * **/
@JvmName("invokePairAnyNullNull")
inline fun <reified A, reified B> Pair<A?, B?>?.getPairOrDefault(
    default: Pair<A?, B?>? = null
): Pair<A, B> where A : Any, B : Any {
    return this.getPairValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [WithDefault] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 2 value options,
 * when it is not originally null, and if it does not call the function [Pair.getPairValueNotNull] with the default parameter
 * **/
@JvmName("invokePairWithDefaultNullNull")
inline fun <reified A, reified B> Pair<A?, B?>?.getPairOrDefault(
    default: Pair<A?, B?>? = null
): Pair<A, B> where A : WithDefault, B : WithDefault {
    return this.getPairValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [Any] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 2 value options,
 * when it is not originally null, and if it does not call the function [Map.getMapValueNotNull] with the default parameter
 * **/
@JvmName("invokeMapAny")
inline fun <reified K: Any, reified V: Any> Map<K, V>?.getMapOrDefault(default: Map<K, V>? = null): Map<K, V> {
    return this.getMapValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [WithDefault] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 2 value options,
 * when it is not originally null, and if it does not call the function [Map.getMapValueNotNull] with the default parameter
 * **/
@JvmName("invokeMapWithDefault")
inline fun <reified K, reified V> Map<K, V>?.getMapOrDefault(
    default: Map<K, V>? = null
): Map<K, V> where K: WithDefault, V: WithDefault {
    return this.getMapValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [Any] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 2 value options,
 * when it is not originally null, and if it does not call the function [Map.getMapValueNotNull] with the default parameter
 * **/
@JvmName("invokeMapAnyNull")
inline fun <reified K: Any, reified V: Any> Map<K, V?>?.getMapOrDefault(default: Map<K, V?>? = null): Map<K, V> {
    return this.getMapValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [WithDefault] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 2 value options,
 * when it is not originally null, and if it does not call the function [Map.getMapValueNotNull] with the default parameter
 * **/
@JvmName("invokeMapWithDefaultNull")
inline fun <reified K, reified V> Map<K, V?>?.getMapOrDefault(
    default: Map<K, V?>? = null
): Map<K, V> where K: WithDefault, V: WithDefault {
    return this.getMapValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [Any] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 2 value options,
 * when it is not originally null, and if it does not call the function [Map.getMapValueNotNull] with the default parameter
 * **/
@JvmName("invokeMapAnyNullNull")
inline fun <reified K: Any, reified V: Any> Map<K?, V?>?.getMapOrDefault(default: Map<K?, V?>? = null): Map<K, V> {
    return this.getMapValueNotNull(default)
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [WithDefault] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 2 value options,
 * when it is not originally null, and if it does not call the function [Map.getMapValueNotNull] with the default parameter
 * **/
@JvmName("invokeMapWithDefaultNullNull")
inline fun <reified K, reified V> Map<K?, V?>?.getMapOrDefault(
    default: Map<K?, V?>? = null
): Map<K, V> where K: WithDefault, V: WithDefault {
    return this.getMapValueNotNull(default)
}


/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.getArrayOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @return the data type [Array], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptyArray] with the default parameter
 * **/
@JvmName("invokeArrayWithDefault")
inline fun <reified T> Array<T>?.getArrayOrDefault(): Array<T> where T : WithDefault {
    return this ?: emptyArray<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.getArrayOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @return the data type [Array], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayOf] with the default parameter
 * **/
@JvmName("invokeArrayAny")
inline fun <reified T> Array<T>?.getArrayOrDefault(): Array<T> where T: Any {
    return this ?: arrayOf()
}

/**
 * @author BrunoNavarro
 * <br><h2>Array<T?>?.getArrayOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [Array].
 * @return the data type [Array], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayOf] with the default parameter
 * **/
@JvmName("invokeArrayWithDefaultNull")
inline fun <reified T> Array<T?>?.getArrayOrDefault(
    default: Array<T?> = arrayOf()
): Array<T> where T : WithDefault {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull().toTypedArray()
    }
    return this.filterNotNull().toTypedArray()
}

/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.getArrayOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [Array].
 * @return the data type [Array], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayOf] with the default parameter
 * **/
@JvmName("invokeArrayAnyNull")
inline fun <reified T> Array<T?>?.getArrayOrDefault(
    default: Array<T?> = arrayOf()
): Array<T> where T: Any {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull().toTypedArray()
    }
    return this.filterNotNull().toTypedArray()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.getSequenceOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [Sequence].
 * @return the data type [Sequence], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptySequence] with the default parameter
 * **/
@JvmName("invokeSequenceWithDefault")
inline fun <reified T> Sequence<T>?.getSequenceOrDefault(
    default: Sequence<T>? = null
): Sequence<T> where T : WithDefault {
    return this ?: default ?: emptySequence()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.getSequenceOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [Sequence].
 * @return the data type [Sequence], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptySequence] with the default parameter
 * **/
@JvmName("invokeSequenceAny")
inline fun <reified T> Sequence<T>?.getSequenceOrDefault(
    default: Sequence<T>? = null
): Sequence<T> where T: Any {
    return this ?: default ?: emptySequence()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T?>?.getSequenceOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [Sequence].
 * @return the data type [Sequence], with 2 value options,
 * when it is not originally null, and if it does not call the function [sequenceOf] with the default parameter
 * **/
@JvmName("invokeSequenceAnyNull")
inline fun <reified T> Sequence<T?>?.getSequenceOrDefault(
    default: Sequence<T?> = sequenceOf()
): Sequence<T> where T: Any {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull()
    }
    return this.filterNotNull()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T?>?.getSequenceOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [Sequence].
 * @return the data type [Sequence], with 2 value options,
 * when it is not originally null, and if it does not call the function [sequenceOf] with the default parameter
 * **/
@JvmName("invokeSequenceWithDefaultNull")
inline fun <reified T> Sequence<T?>?.getSequenceOrDefault(
    default: Sequence<T?> = sequenceOf()
): Sequence<T> where T : WithDefault {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull()
    }
    return this.filterNotNull()
}


/**
 * @author BrunoNavarro
 * <br><h2>ArrayList<T>?.getArrayListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [ArrayList].
 * @return the data type [ArrayList], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayListOf] with the default parameter
 * **/
@JvmName("invokeArrayListWithDefault")
inline fun <reified T> ArrayList<T>?.getArrayListOrDefault(
    default: ArrayList<T>? = null
): ArrayList<T> where T : WithDefault {
    return this ?: default ?: arrayListOf()
}

/**
 * @author BrunoNavarro
 * <br><h2>ArrayList<T>?.getArrayListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [ArrayList].
 * @return the data type [ArrayList], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayListOf] with the default parameter
 * **/
@JvmName("invokeArrayListAny")
inline fun <reified T> ArrayList<T>?.getArrayListOrDefault(
    default: ArrayList<T>? = null
): ArrayList<T> where T : Any {
    return this ?: default ?: arrayListOf()
}

/**
 * @author BrunoNavarro
 * <br><h2>ArrayList<T?>?.getArrayListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [ArrayList].
 * @return the data type [ArrayList], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayListOf] with the default parameter
 * **/
@JvmName("invokeArrayListWithDefaultNull")
inline fun <reified T> ArrayList<T?>?.getArrayListOrDefault(
    default: ArrayList<T?> = arrayListOf()
): ArrayList<T> where T : WithDefault {
    if (this == null || this.all { it == null }) {
        return ArrayList(default.filterNotNull())
    }
    return ArrayList(this.filterNotNull())
}

/**
 * @author BrunoNavarro
 * <br><h2>ArrayList<T?>?.getArrayListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [ArrayList].
 * @return the data type [ArrayList], with 2 value options,
 * when it is not originally null, and if it does not call the function [arrayListOf] with the default parameter
 * **/
@JvmName("invokeArrayListAnyNull")
inline fun <reified T> ArrayList<T?>?.getArrayListOrDefault(
    default: ArrayList<T?> = arrayListOf()
): ArrayList<T> where T : Any {
    if (this == null || this.all { it == null }) {
        return ArrayList(default.filterNotNull())
    }
    return ArrayList(this.filterNotNull())
}

/**
 * @author BrunoNavarro
 * <br><h2>List<T>?.getListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [List].
 * @return the data type [List], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptyList] with the default parameter
 * **/
@JvmName("invokeListWithDefault")
inline fun <reified T> List<T>?.getListOrDefault(
    default: List<T> = emptyList()
): List<T> where T : WithDefault {
    return this ?: default
}

/**
 * @author BrunoNavarro
 * <br><h2>List<T?>?.getListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [List].
 * @return the data type [List], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptyList] with the default parameter
 * **/
@JvmName("invokeListWithDefaultNull")
inline fun <reified T> List<T?>?.getListOrDefault(
    default: List<T?> = emptyList()
): List<T> where T : WithDefault {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull()
    }
    return this.filterNotNull()
}

/**
 * @author BrunoNavarro
 * <br><h2>List<T>?.getListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [List].
 * @return the data type [List], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptyList] with the default parameter.
 * **/
@JvmName("invokeListAny")
inline fun <reified T> List<T>?.getListOrDefault(
    default: List<T> = emptyList()
): List<T> where T : Any {
    return this ?: default
}

/**
 * @author BrunoNavarro
 * <br><h2>List<T?>?.getListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [List].
 * @return the data type [List], with 2 value options,
 * when it is not originally null, and if it does not call the function [emptyList] with the default parameter
 * **/
@JvmName("invokeListAnyNull")
inline fun <reified T> List<T?>?.getListOrDefault(
    default: List<T?> = emptyList()
): List<T> where T : Any {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull()
    }
    return this.filterNotNull()
}



/**
 * @author BrunoNavarro
 * <br><h2>MutableList<T>?.getMutableListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [MutableList].
 * @return the data type [MutableList], with 2 value options,
 * when it is not originally null, and if it does not call the function [mutableListOf] with the default parameter
 * **/
@JvmName("invokeMutableListWithDefault")
inline fun <reified T> MutableList<T>?.getMutableListOrDefault(
    default: MutableList<T> = mutableListOf()
): MutableList<T> where T : WithDefault {
    return this ?: default
}


/**
 * @author BrunoNavarro
 * <br><h2>MutableList<T>?.getMutableListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [MutableList].
 * @return the data type [MutableList], with 2 value options,
 * when it is not originally null, and if it does not call the function [mutableListOf] with the default parameter
 * **/
@JvmName("invokeMutableListAny")
inline fun <reified T> MutableList<T>?.getMutableListOrDefault(
    default: MutableList<T> = mutableListOf()
): MutableList<T> where T : Any {
    return this ?: default
}


/**
 * @author BrunoNavarro
 * <br><h2>MutableList<T?>?.getMutableListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [WithDefault] type class.
 * @param default is a default value of type [MutableList].
 * @return the data type [MutableList], with 2 value options,
 * when it is not originally null, and if it does not call the function [mutableListOf] with the default parameter
 * **/
@JvmName("invokeMutableListWithDefaultNull")
inline fun <reified T> MutableList<T?>?.getMutableListOrDefault(
    default: MutableList<T?> = mutableListOf()
): MutableList<T> where T : WithDefault {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull().toMutableList()
    }
    return this.filterNotNull().toMutableList()
}

/**
 * @author BrunoNavarro
 * <br><h2>MutableList<T?>?.getMutableListOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with variables [T] object of [Any] type class.
 * @param default is a default value of type [MutableList].
 * @return the data type [MutableList], with 2 value options,
 * when it is not originally null, and if it does not call the function [mutableListOf] with the default parameter
 * **/
@JvmName("invokeMutableListAnyNull")
inline fun <reified T> MutableList<T?>?.getMutableListOrDefault(
    default: MutableList<T?> = mutableListOf()
): MutableList<T> where T : Any {
    if (this == null || this.all { it == null }) {
        return default.filterNotNull().toMutableList()
    }
    return this.filterNotNull().toMutableList()
}


















/**
 * @author BrunoNavarro
 * <br><h2>String?.getValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [String].
 * @param default is a default value of type [String].
 * @return the data type [String], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an empty string ""
 * **/
private fun String?.getValueNotNull(default: String? = null): String {
    return this ?: default ?: ""
}

/**
 * @author BrunoNavarro
 * <br><h2>Int?.getValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Int].
 * @param default is a default value of type [Int].
 * @return the data type [Int], with 3 value options,
 * when it is not originally, if it defines a default value, and if it is, it returns an int 0
 * **/
private fun Int?.getValueNotNull(default: Int? = null): Int {
    return this ?: default ?: 0
}

/**
 * @author BrunoNavarro
 * <br><h2>Number?.getValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Number].
 * @param default is a default value of type [Number].
 * @return the data type [Number], with 3 value options,
 * when it is not originally, if it defines a default value, and if it is, it returns an int 0
 * **/
private fun Number?.getValueNotNull(default: Number? = null): Number {
    return this ?: default ?: 0
}

/**
 * @author BrunoNavarro
 * <br><h2>Double?.getValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Double].
 * @param default is a default value of type [Double].
 * @return the data type [Double], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an empty double 0.0
 * **/
private fun Double?.getValueNotNull(default: Double? = null): Double {
    return this ?: default ?: 0.0
}

/**
 * @author BrunoNavarro
 * <br><h2>Boolean?.getValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Boolean].
 * @param default is a default value of type [Boolean].
 * @return the data type [Boolean], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an boolean false
 * **/
private fun Boolean?.getValueNotNull(default: Boolean? = null): Boolean {
    return this ?: default ?: false
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [Any] or [WithDefault] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Pair empty value
 * **/
inline fun <reified A, reified B> Pair<A, B>?.getPairValueNotNull(
    default: Pair<A, B>? = null
): Pair<A, B> where B : Any, A : Any, A: WithDefault, B : WithDefault {
    return this ?: default ?: Pair(createObject<A>(), createObject<B>())
}

/**
 * @author BrunoNavarro
 * <br><h2>Pair?.getPairValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Pair] of [Any] or [WithDefault] type class.
 * @param default is a default value of type [Pair].
 * @return the data type [Pair], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Pair empty value
 * **/
@JvmName("getValueNotNullPairNull")
inline fun <reified A, reified B> Pair<A, B?>?.getPairValueNotNull(
    default: Pair<A, B?>? = null
): Pair<A, B> where B : Any, A : Any, A: WithDefault, B: WithDefault {
    return Pair(
        ((this ?: default)?.first ?: createObject<A>()),
        ((this ?: default)?.second ?: createObject<B>())
    ) //this ?: default ?: Pair(createObject(), createObject())
}

@JvmName("getValueNotNullPairWithDefaultNullNull")
inline fun <reified A, reified B> Pair<A?, B?>?.getPairValueNotNull(
    default: Pair<A?, B?>? = null
): Pair<A, B> where A: WithDefault, B: WithDefault {
    return Pair(
        ((this ?: default)?.first ?: createObject<A>()),
        ((this ?: default)?.second ?: createObject<B>())
    ) //this ?: default ?: Pair(createObject(), createObject())
}

@JvmName("getValueNotNullPairAnyNullNull")
inline fun <reified A, reified B> Pair<A?, B?>?.getPairValueNotNull(
    default: Pair<A?, B?>? = null
): Pair<A, B> where B : Any, A : Any {
    return Pair(
        ((this ?: default)?.first ?: createObject<A>()),
        ((this ?: default)?.second ?: createObject<B>())
    ) //this ?: default ?: Pair(createObject(), createObject())
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [Any] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Map empty value
 * **/
@JvmName("getValueNotNullMapAny")
inline fun <reified K, reified V> Map<K, V>?.getMapValueNotNull(
    default: Map<K, V>? = null
): Map<K, V> where K: Any, V : Any {
    return this ?: default ?: mapOf()  //Map(createObject(), createObject())
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [WithDefault] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Map empty value
 * **/
@JvmName("getValueNotNullMapWithDefault")
inline fun <reified K, reified V> Map<K, V>?.getMapValueNotNull(
    default: Map<K, V>? = null
): Map<K, V> where K: WithDefault, V: WithDefault {
    return this ?: default ?: mapOf()  //Map(createObject(), createObject())
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [Any] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Map empty value
 * **/
@JvmName("getValueNotNullMapAnyNull")
inline fun <reified K, reified V> Map<K, V?>?.getMapValueNotNull(
    default: Map<K, V?>? = null
): Map<K, V> where K: Any, V : Any {
    val map = mutableMapOf<K,V>()
    this?.forEach { (t, u) ->
      if (u != null) {
          map[t] = u
      }else {
          map[t] = createObject<V>()
      }
    } ?: run {
        default?.forEach { (t, u) ->
            if (u != null) {
                map[t] = u
            }else {
                map[t] = createObject<V>()
            }
        }
    }
    return map.toMap() //this ?: default ?: mapOf()  //Map(createObject(), createObject())
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [WithDefault] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Map empty value
 * **/
@JvmName("getValueNotNullMapWithDefaultNull")
inline fun <reified K, reified V> Map<K, V?>?.getMapValueNotNull(
    default: Map<K, V?>? = null
): Map<K, V> where K: WithDefault, V: WithDefault {
    val map = mutableMapOf<K,V>()
    this?.forEach { (t, u) ->
        if (u != null) {
            map[t] = u
        }else {
            map[t] = createObject<V>()
        }
    } ?: run {
        default?.forEach { (t, u) ->
            if (u != null) {
                map[t] = u
            }else {
                map[t] = createObject<V>()
            }
        }
    }
    return map.toMap() //this ?: default ?: mapOf()  //Map(createObject(), createObject())
}


/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [Any] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Map empty value
 * **/
@JvmName("getValueNotNullMapAnyNullNull")
inline fun <reified K, reified V> Map<K?, V?>?.getMapValueNotNull(
    default: Map<K?, V?>? = null
): Map<K, V> where  K: Any, V: Any {
    val map = mutableMapOf<K,V>()
    this?.forEach { (t, u) ->
        if (u != null) {
            if (t != null) {
                map[t] = u
            }else {
                map[createObject<K>()] = u
            }
        } else {
            if (t != null) {
                map[t] = createObject<V>()
            }else {
                map[createObject<K>()] = createObject<V>()
            }
        }
    } ?: run {
        default?.forEach { (t, u) ->
            if (u != null) {
                if (t != null) {
                    map[t] = u
                }else {
                    map[createObject<K>()] = u
                }
            } else {
                if (t != null) {
                    map[t] = createObject<V>()
                }else {
                    map[createObject<K>()] = createObject<V>()
                }
            }
        }
    }
    return map.toMap() //this ?: default ?: mapOf()  //Map(createObject(), createObject())
}

/**
 * @author BrunoNavarro
 * <br><h2>Map?.getMapValueNotNull</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable <br>
 * and if it is null it returns a default value. <br><br>
 *
 * This function is only compatible with primitive variables [Map] of [WithDefault] type class.
 * @param default is a default value of type [Map].
 * @return the data type [Map], with 3 value options,
 * when it is not originally null, if it defines a default value, and if it is, it returns an Map empty value
 * **/
@JvmName("getValueNotNullMapWithDefaultNullNull")
inline fun <reified K, reified V> Map<K?, V?>?.getMapValueNotNull(
    default: Map<K?, V?>? = null
): Map<K, V> where K: WithDefault, V: WithDefault {
    val map = mutableMapOf<K,V>()
    this?.forEach { (t, u) ->
        if (u != null) {
            if (t != null) {
                map[t] = u
            }else {
                map[createObject<K>()] = u
            }
        } else {
            if (t != null) {
                map[t] = createObject<V>()
            }else {
                map[createObject<K>()] = createObject<V>()
            }
        }
    } ?: run {
        default?.forEach { (t, u) ->
            if (u != null) {
                if (t != null) {
                    map[t] = u
                }else {
                    map[createObject<K>()] = u
                }
            } else {
                if (t != null) {
                    map[t] = createObject<V>()
                }else {
                    map[createObject<K>()] = createObject<V>()
                }
            }
        }
    }
    return map.toMap() //this ?: default ?: mapOf()  //Map(createObject(), createObject())
}


/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultListAnyPredicate")
inline fun <reified T> List<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T : Any {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultListWithDefaultPredicate")
inline fun <reified T> List<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T : WithDefault {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultListAny")
inline fun <reified T> List<T>?.firstOrDefault(): T where T : Any{
    return this?.firstOrNull() ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultListWithDefault")
inline fun <reified T> List<T>?.firstOrDefault(): T where T : WithDefault {
    return this?.firstOrNull() ?: createObject<T>()
}


/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultMutableListAnyPredicate")
inline fun <reified T> MutableList<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T : Any {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultMutableListWithDefaultPredicate")
inline fun <reified T> MutableList<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T : WithDefault {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultMutableListAny")
inline fun <reified T> MutableList<T>?.firstOrDefault(): T where T : Any{
    return this?.firstOrNull() ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultMutableListWithDefault")
inline fun <reified T> MutableList<T>?.firstOrDefault(): T where T : WithDefault {
    return this?.firstOrNull() ?: createObject<T>()
}


/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultIterableAnyPredicate")
inline fun <reified T> Iterable<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T : Any {
    return this?.firstOrNull(predicate) ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultIterableWithDefaultPredicate")
inline fun <reified T> Iterable<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T : WithDefault {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultIterableAny")
inline fun <reified T> Iterable<T>?.firstOrDefault(): T where T : Any{
    return this?.firstOrNull() ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultIterableWithDefault")
inline fun <reified T> Iterable<T>?.firstOrDefault(): T where T : WithDefault {
    return this?.firstOrNull() ?: createObject<T>()
}


/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Array] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultArrayAnyPredicate")
inline fun <reified T> Array<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T: Any {
    return this?.firstOrNull(predicate) ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Array] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultArrayWithDefaultPredicate")
inline fun <reified T> Array<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T: WithDefault {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Array] of [Any] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultArrayWithDefaultAny")
inline fun <reified T> Array<T>?.firstOrDefault(): T where T: Any {
    return this?.firstOrNull() ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Array<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Array] of [WithDefault] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultArrayWithDefault")
inline fun <reified T> Array<T>?.firstOrDefault(): T where T: WithDefault {
    return this?.firstOrNull() ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultSequenceWithDefaultPredicate")
inline fun <reified T> Sequence<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T: WithDefault {
    return this?.firstOrNull(predicate) ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultSequenceAnyPredicate")
inline fun <reified T> Sequence<T>?.firstOrDefault(predicate: (T) -> Boolean): T where T: Any{
    return this?.firstOrNull(predicate) ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [WithDefault] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultSequenceWithDefault")
inline fun <reified T> Sequence<T>?.firstOrDefault(): T where T: WithDefault {
    return this?.firstOrNull() ?: createObject<T>()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.firstOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [firstOrNull] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [Any] type class.
 * @return the data type [T], as a result of locating the first element,
 * if none is found, the [createObject] function is called and it returns a default value.
 * **/
@JvmName("firstOrDefaultSequenceAny")
inline fun <reified T> Sequence<T>?.firstOrDefault(): T where T: Any{
    return this?.firstOrNull() ?: run {
        if (T::class == Boolean::class){
            false as T
        } else if (T::class == String::class){
            "" as T
        } else if (T::class == Number::class){
            0 as T
        } else if (T::class == Int::class){
            0 as T
        } else if (T::class == Double::class){
            0.0 as T
        } else if (T::class == Pair::class){
            Pair(null, null) as T
        } else if (T::class == Map::class){
            emptyMap<Any, Any>() as T
        } else if (T::class == Array::class){
            emptyArray<T>() as T
        } else {
            createObject<T>()
        }
    }
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.filterOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [filter] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [List], as a result of filtering the elements that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [emptyList] function is called and it returns a default value.
 * **/
@JvmName("filterOrDefaultIterableWithDefaultPredicate")
inline fun <T> Iterable<T>?.filterOrDefault(predicate: (T) -> Boolean): List<T> where T: WithDefault {
    return this?.filter(predicate) ?: emptyList()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.filterOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [filter] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [List], as a result of filtering the elements that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [emptyList] function is called and it returns a default value.
 * **/
@JvmName("filterOrDefaultIterableAnyPredicate")
inline fun <T> Iterable<T>?.filterOrDefault(predicate: (T) -> Boolean): List<T> where T: Any {
    return this?.filter(predicate) ?: emptyList()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.filterOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [filter] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [WithDefault] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [Sequence], as a result of filtering the elements that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [emptySequence] function is called and it returns a default value.
 * **/
@JvmName("filterOrDefaultSequenceWithDefaultPredicate")
fun <T> Sequence<T>?.filterOrDefault(predicate: (T) -> Boolean): Sequence<T> where T: WithDefault {
    return this?.filter(predicate) ?: emptySequence()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.filterOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [filter] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [Any] type class.
 * @param predicate -> is a [Boolean] search condition.
 * @return the data type [Sequence], as a result of filtering the elements that
 * meets the conditions of the [predicate] parameter,
 * if none is found, the [emptySequence] function is called and it returns a default value.
 * **/
@JvmName("filterOrDefaultSequenceAnyPredicate")
fun <T> Sequence<T>?.filterOrDefault(predicate: (T) -> Boolean): Sequence<T> where T: Any {
    return this?.filter(predicate) ?: emptySequence()
}


/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.flatMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [flatMap] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [WithDefault] type class.
 * @param transform -> is a [Iterable] search condition.
 * @return the data type [Sequence], as a result of filtering the elements that
 * meets the conditions of the [transform] parameter,
 * if none is found, the [emptySequence] function is called and it returns a default value.
 * **/
@JvmName("flatMapOrDefaultSequenceWithDefaultPredicate")
fun <T, R>  Sequence<T>?.flatMapOrDefault(transform: (T) -> Iterable<R>): Sequence<R> where R: WithDefault, T: WithDefault {
    return this?.flatMap {
        transform(it).toList()
    } ?: emptySequence()
}

/**
 * @author BrunoNavarro
 * <br><h2>Sequence<T>?.flatMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [flatMap] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Sequence] of [Any] type class.
 * @param transform -> is a [Iterable] search condition.
 * @return the data type [Sequence], as a result of filtering the elements that
 * meets the conditions of the [transform] parameter,
 * if none is found, the [emptySequence] function is called and it returns a default value.
 * **/
@JvmName("flatMapOrDefaultSequenceAnyPredicate")
fun <T, R>  Sequence<T>?.flatMapOrDefault(transform: (T) -> Iterable<R>): Sequence<R> where R: Any, T: Any {
    return this?.flatMap {
        transform(it).toList()
    } ?: emptySequence()
}


/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.flatMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [flatMap] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [WithDefault] type class.
 * @param transform -> is a [Iterable] search condition.
 * @return the data type [List], as a result of filtering the elements that
 * meets the conditions of the [transform] parameter,
 * if none is found, the [emptyList] function is called and it returns a default value.
 * **/
@JvmName("flatMapOrDefaultIterableWithDefaultPredicate")
fun <T, R>  Iterable<T>?.flatMapOrDefault(transform: (T) -> Iterable<R>): List<R> where R: WithDefault {
    return this?.flatMap {
        transform(it).toList()
    } ?: emptyList()
}

/**
 * @author BrunoNavarro
 * <br><h2>Iterable<T>?.flatMapOrDefault</h2><br>
 *
 * It is a function that is responsible for taking the value of a variable.<br>
 * invoke the [flatMap] function with its predicate conditions,
 * and if the result is null, an empty instance of the expected object is created, returning it as a default value. <br><br>
 *
 * This function is only compatible with variables [Iterable] of [Any] type class.
 * @param transform -> is a [Iterable] search condition.
 * @return the data type [List], as a result of filtering the elements that
 * meets the conditions of the [transform] parameter,
 * if none is found, the [emptyList] function is called and it returns a default value.
 * **/
@JvmName("flatMapOrDefaultIterableAnyPredicate")
fun <T, R>  Iterable<T>?.flatMapOrDefault(transform: (T) -> Iterable<R>): List<R> where R: Any {
    return this?.flatMap {
        transform(it).toList()
    } ?: emptyList()
}


inline fun <reified T: Any> createObject(): T {
    return T::class.java.getDeclaredConstructor().apply {
        isAccessible = true
    }.newInstance()
}


