package com.daniel.demo.dagger2.demo_2.computer.cpu

import dagger.Module
import dagger.Provides

@Module
object CpuModule {

    @Provides
    fun provideCpu(cpu: IntelCpu): Cpu {
        return cpu
    }
}