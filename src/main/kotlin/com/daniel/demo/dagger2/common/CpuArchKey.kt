package com.daniel.demo.dagger2.common

import dagger.MapKey

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class CpuArchKey(
    val arch: CpuArch
)
