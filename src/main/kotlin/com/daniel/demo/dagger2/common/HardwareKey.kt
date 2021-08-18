package com.daniel.demo.dagger2.common

import dagger.MapKey
import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey(unwrapValue = false)
annotation class HardwareKey(
    val type: HardwareType,
    val implementClass: KClass<*>
)
