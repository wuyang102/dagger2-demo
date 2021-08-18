package com.daniel.demo.dagger2.demo_6.computer.memory

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface MemoryModule {

    @Binds
    @IntoSet
    fun bindMemory(memory: KingstonMemory): Memory

    @Binds
    @IntoSet
    fun bindMemory2(memory: GSkillMemory): Memory
}