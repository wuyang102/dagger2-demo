package com.daniel.demo.dagger2.demo_6.computer.cpu

import com.daniel.demo.dagger2.common.HardwareScope
import dagger.Component

@HardwareScope
@Component(modules = [CpuModule::class])
interface CpuComponent {

    fun cpu(): Cpu

}