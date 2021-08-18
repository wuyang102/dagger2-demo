package com.daniel.demo.dagger2.demo_5.computer.cpu

import com.daniel.demo.dagger2.common.HardwareScope
import dagger.Binds
import dagger.Module

@Module
interface CpuModule {

    @Binds
    @HardwareScope
    fun bindCpu(cpu: IntelCpu): Cpu
}