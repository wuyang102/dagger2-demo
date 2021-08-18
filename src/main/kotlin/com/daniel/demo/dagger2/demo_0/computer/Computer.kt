package com.daniel.demo.dagger2.demo_0.computer

import com.daniel.demo.dagger2.demo_0.computer.cpu.Cpu
import com.daniel.demo.dagger2.demo_0.computer.memory.Memory


class Computer {

    val memory = Memory()

    val cpu = Cpu()

    fun info(): String {
        return "${cpu.info()} \n${memory.info()}"
    }
}