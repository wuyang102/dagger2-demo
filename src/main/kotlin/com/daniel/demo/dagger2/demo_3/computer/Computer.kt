package com.daniel.demo.dagger2.demo_3.computer

import com.daniel.demo.dagger2.common.Brand
import com.daniel.demo.dagger2.common.ProductModel
import com.daniel.demo.dagger2.demo_3.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_3.computer.disk.Disk
import com.daniel.demo.dagger2.demo_3.computer.memory.Memory
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class Computer @Inject constructor(cpuProvider: Provider<Cpu>) {

    @Inject
    @Brand
    lateinit var brand: String

    @Inject
    @ProductModel
    lateinit var productModel: String

    @Inject
    lateinit var memories: Set<@JvmSuppressWildcards Memory>

    @Inject
    lateinit var disks: Map<String, @JvmSuppressWildcards Disk>

    var cpus: List<Cpu>

    init {
        val cpu1 = cpuProvider.get()
        val cpu2 = cpuProvider.get()
        cpus = listOf(cpu1, cpu2)
    }

    fun info(): String {
        return "$brand $productModel ${hashCode()}\n${cpuInfo()}${memoryInfo()}${diskInfo()}"
    }

    private fun cpuInfo(): String {
        return cpus.mapIndexed { _, cpu -> "${cpu.info()}\n" }.reduce { acc, s -> acc + s }
    }

    private fun memoryInfo(): String {
        return memories.mapIndexed { _, memory -> "${memory.info()}\n" }.reduce { acc, s -> acc + s }
    }

    private fun diskInfo(): String {
        return disks.toList().mapIndexed { _, (_, disk) -> "${disk.info()}\n" }.reduce { acc, s -> acc + s }
    }
}