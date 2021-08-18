package com.daniel.demo.dagger2.demo_4.computer

import com.daniel.demo.dagger2.demo_4.computer.board.BoardModule
import com.daniel.demo.dagger2.demo_4.computer.cpu.CpuComponent
import com.daniel.demo.dagger2.demo_4.computer.disk.DiskComponent
import com.daniel.demo.dagger2.demo_4.computer.memory.MemoryComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ComputerModule::class,
        BoardModule::class
    ]
)
interface ComputerComponent {

    fun computer(): Computer
    fun cpuComponentBuilder(): CpuComponent.Builder
    fun memoryComponentBuilder(): MemoryComponent.Builder
    fun diskComponentBuilder(): DiskComponent.Builder

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun brand(@Named("brand") brand: String): Builder

        fun build(): ComputerComponent
    }
}