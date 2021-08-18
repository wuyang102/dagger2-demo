package com.daniel.demo.dagger2.demo_2.computer.memory

import dagger.Binds
import dagger.Module

@Module
interface MemoryModule {

    @Binds
    fun bindMemory(memory: KingstonMemory): Memory
}