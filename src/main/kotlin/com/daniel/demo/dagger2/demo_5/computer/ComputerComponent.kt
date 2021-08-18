package com.daniel.demo.dagger2.demo_5.computer

import com.daniel.demo.dagger2.common.ComputerScope
import com.daniel.demo.dagger2.demo_5.computer.board.BoardModule
import com.daniel.demo.dagger2.demo_5.computer.memory.MemoryComponent
import com.daniel.demo.dagger2.demo_5.computer.cpu.CpuComponent
import com.daniel.demo.dagger2.demo_5.computer.disk.DiskComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named


@ComputerScope
@Component(
    modules = [
        ComputerModule::class,
        BoardModule::class
    ],
    dependencies = [CpuComponent::class, MemoryComponent::class, DiskComponent::class]
)
interface ComputerComponent {

    fun computer(): Computer

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun brand(@Named("brand") brand: String): Builder

        fun cpuComponent(c: CpuComponent): Builder

        fun memoryComponent(c: MemoryComponent): Builder

        fun diskComponent(c: DiskComponent): Builder

        fun build(): ComputerComponent
    }
}