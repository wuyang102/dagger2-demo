package com.daniel.demo.dagger2.demo_2.computer

import com.daniel.demo.dagger2.demo_2.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_2.computer.memory.Memory
import javax.inject.Inject

class Computer @Inject constructor() {

    @Inject
    lateinit var memory: Memory

    @Inject
    lateinit var cpu: Cpu

    fun info(): String {
        return "${cpu.info()}\n${memory.info()}"
    }
}