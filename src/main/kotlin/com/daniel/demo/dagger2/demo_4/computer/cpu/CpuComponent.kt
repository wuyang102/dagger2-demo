package com.daniel.demo.dagger2.demo_4.computer.cpu

import com.daniel.demo.dagger2.common.HardwareScope
import dagger.Subcomponent

@HardwareScope
@Subcomponent(modules = [CpuModule::class])
interface CpuComponent {

    fun cpu(): Cpu

    @Subcomponent.Builder
    interface Builder {

        fun build(): CpuComponent
    }
}