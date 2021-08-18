package com.daniel.demo.dagger2.demo_0.computer.memory

import com.daniel.demo.dagger2.common.Hardware

class Memory : Hardware {

    override fun getBrand(): String = "kingston"

    override fun info(): String {
        return "Memory: ${getBrand()} ${getMemorySize()} ${hashCode()}"
    }

    fun getMemorySize(): String = "2G"

}