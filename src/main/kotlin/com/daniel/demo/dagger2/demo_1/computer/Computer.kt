package com.daniel.demo.dagger2.demo_1.computer

import com.daniel.demo.dagger2.demo_1.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_1.computer.memory.Memory
import javax.inject.Inject

class Computer @Inject constructor() {

    @Inject
    lateinit var memory: Memory

    lateinit var cpu: Cpu

    @Inject
    fun init(cpu: Cpu) {
        this.cpu = cpu
    }

    fun info(): String {
        return "${cpu.info()}\n${memory.info()}"
    }
}