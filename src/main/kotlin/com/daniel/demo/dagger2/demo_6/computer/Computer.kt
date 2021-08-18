package com.daniel.demo.dagger2.demo_6.computer

import com.daniel.demo.dagger2.common.ComputerScope
import com.daniel.demo.dagger2.demo_6.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_6.computer.disk.Disk
import com.daniel.demo.dagger2.demo_6.computer.memory.Memory
import com.daniel.demo.dagger2.demo_6.computer.board.Board
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Provider


@ComputerScope
class Computer @Inject constructor() {

    @Inject
    @Named("brand")
    lateinit var brand: String

    @Inject
    lateinit var board: Board

    @Inject
    lateinit var cpuProvider: Provider<Cpu>

    @Inject
    lateinit var memories: Set<@JvmSuppressWildcards Memory>

    @Inject
    lateinit var disks: Map<String, @JvmSuppressWildcards Disk>

    lateinit var cpus: List<Cpu>

    @Inject
    fun init() {
        val cpu1 = cpuProvider.get()
        val cpu2 = cpuProvider.get()
        cpus = listOf(cpu1, cpu2)
        cpus.forEach { board.mount(it) }

        memories.forEach { board.mount(it) }
        disks.forEach { (_, disk) -> board.mount(disk) }
    }

    fun info(): String {
        return "$brand ${hashCode()}\n${board.info()}"
    }

}