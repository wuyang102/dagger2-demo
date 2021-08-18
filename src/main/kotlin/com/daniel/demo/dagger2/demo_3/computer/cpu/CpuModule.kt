package com.daniel.demo.dagger2.demo_3.computer.cpu

import com.daniel.demo.dagger2.common.*
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface CpuModule {

    @Binds
    fun bindCpu(cpu: IntelCpu): Cpu

    @Binds
    @IntoMap
    @CpuArchKey(CpuArch.X86)
    fun bindCpu2(cpu: IntelCpu): Cpu

    @Binds
    @IntoMap
    @HardwareKey(HardwareType.CPU, Cpu::class)
    fun bindCpu3(cpu: IntelCpu): Hardware
}