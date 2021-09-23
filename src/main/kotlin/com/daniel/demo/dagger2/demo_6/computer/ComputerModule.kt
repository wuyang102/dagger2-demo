package com.daniel.demo.dagger2.demo_6.computer

import com.daniel.demo.dagger2.demo_6.computer.gpu.Gpu
import dagger.BindsOptionalOf
import dagger.Module

@Module
interface ComputerModule {

    @BindsOptionalOf
    fun optionalGpu(): Gpu
}