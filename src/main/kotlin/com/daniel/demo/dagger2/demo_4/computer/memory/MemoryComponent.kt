package com.daniel.demo.dagger2.demo_4.computer.memory

import dagger.Subcomponent

@Subcomponent(modules = [MemoryModule::class])
interface MemoryComponent {

    fun memories(): Set<@JvmSuppressWildcards Memory>

    @Subcomponent.Builder
    interface Builder {
        fun build(): MemoryComponent
    }
}