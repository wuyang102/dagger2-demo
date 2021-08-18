package com.daniel.demo.dagger2.demo_4.computer

import com.daniel.demo.dagger2.demo_4.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_4.computer.disk.Disk
import com.daniel.demo.dagger2.demo_4.computer.memory.Memory
import com.daniel.demo.dagger2.demo_4.computer.board.Board
import com.daniel.demo.dagger2.demo_4.computer.cpu.CpuComponent
import com.daniel.demo.dagger2.demo_4.computer.disk.DiskComponent
import com.daniel.demo.dagger2.demo_4.computer.memory.MemoryComponent
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class Computer @Inject constructor() {

    @Inject
    @Named("brand")
    lateinit var brand: String

    @Inject
    lateinit var board: Board

    @Inject
    lateinit var cpuComponentBuilder: CpuComponent.Builder

    @Inject
    lateinit var memoryComponentBuilder: MemoryComponent.Builder

    @Inject
    lateinit var diskComponentBuilder: DiskComponent.Builder

    lateinit var memories: Set<@JvmSuppressWildcards Memory>

    lateinit var disks: Map<String, @JvmSuppressWildcards Disk>

    lateinit var cpus: List<Cpu>

    @Inject
    fun init() {
        val cpuComponent = cpuComponentBuilder.build()
        val cpu1 = cpuComponent.cpu()
        val cpu2 = cpuComponent.cpu()
        cpus = listOf(cpu1, cpu2)
        cpus.forEach { board.mount(it) }

        val memoryComponent = memoryComponentBuilder.build()
        memories = memoryComponent.memories()
        memories.forEach { board.mount(it) }

        val diskComponent = diskComponentBuilder.build()
        disks = diskComponent.disks()
        disks.forEach { (_, disk) -> board.mount(disk) }
    }

    fun info(): String {
        return "$brand ${hashCode()}\n${board.info()}"
    }

}