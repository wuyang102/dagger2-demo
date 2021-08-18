package com.daniel.demo.dagger2.demo_5.computer.memory

import dagger.Component

@Component(modules = [MemoryModule::class])
interface MemoryComponent {

    fun memories(): Set<@JvmSuppressWildcards Memory>

}