package com.daniel.demo.dagger2.demo_3.computer.memory

import com.daniel.demo.dagger2.common.Hardware
import com.daniel.demo.dagger2.common.HardwareKey
import com.daniel.demo.dagger2.common.HardwareType
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet

@Module
interface MemoryModule {

    @Binds
    @IntoSet
    fun bindMemory(memory: KingstonMemory): Memory

    @Binds
    @IntoSet
    fun bindMemory2(memory: GSkillMemory): Memory

    @Module
    companion object {
        @Provides
        @ElementsIntoSet
        fun provideMemories(m1: KingstonMemory, m2: GSkillMemory): Set<Memory> {
            return setOf(m1, m2)
        }

        @Provides
        fun provideMemoryMap(set: Set<@JvmSuppressWildcards Memory>): Map<String, Memory> {
            return set.associateBy { memory -> memory.getBrand() }
        }
    }

    @Binds
    @IntoMap
    @HardwareKey(HardwareType.MEMORY, KingstonMemory::class)
    fun bindMemory3(memory: KingstonMemory): Hardware

    @Binds
    @IntoMap
    @HardwareKey(HardwareType.MEMORY, GSkillMemory::class)
    fun bindMemory4(memory: GSkillMemory): Hardware
}