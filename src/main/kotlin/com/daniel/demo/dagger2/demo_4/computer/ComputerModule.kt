package com.daniel.demo.dagger2.demo_4.computer

import com.daniel.demo.dagger2.demo_4.computer.cpu.CpuComponent
import com.daniel.demo.dagger2.demo_4.computer.disk.DiskComponent
import com.daniel.demo.dagger2.demo_4.computer.memory.MemoryComponent
import dagger.Module

@Module(
    subcomponents = [
        CpuComponent::class,
        DiskComponent::class,
        MemoryComponent::class
    ]
)
interface ComputerModule