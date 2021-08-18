package com.daniel.demo.dagger2.demo_2.computer

import com.daniel.demo.dagger2.demo_2.Programmer
import com.daniel.demo.dagger2.demo_2.computer.cpu.CpuModule
import com.daniel.demo.dagger2.demo_2.computer.memory.MemoryModule
import dagger.Component

@Component(modules = [CpuModule::class, MemoryModule::class])
interface ComputerComponent {

    fun inject(programmer: Programmer)

}