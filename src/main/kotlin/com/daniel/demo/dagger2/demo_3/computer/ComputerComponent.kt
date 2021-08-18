package com.daniel.demo.dagger2.demo_3.computer

import com.daniel.demo.dagger2.common.*
import com.daniel.demo.dagger2.demo_3.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_3.computer.cpu.CpuModule
import com.daniel.demo.dagger2.demo_3.computer.disk.DiskModule
import com.daniel.demo.dagger2.demo_3.computer.memory.MemoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [CpuModule::class, MemoryModule::class, DiskModule::class])
interface ComputerComponent {

    fun computer(): Computer

    fun cpuMap(): Map<CpuArch, @JvmSuppressWildcards Cpu>

    fun hardwareMap(): Map<HardwareKey, @JvmSuppressWildcards Hardware>

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun brand(@Brand brand: String): Builder

        @BindsInstance
        fun productModel(@ProductModel productModel: String): Builder

        fun build(): ComputerComponent
    }
}