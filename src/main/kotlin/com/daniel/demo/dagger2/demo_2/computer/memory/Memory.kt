package com.daniel.demo.dagger2.demo_2.computer.memory

import com.daniel.demo.dagger2.common.Hardware

interface Memory : Hardware {

    fun getMemorySize(): String

    override fun info(): String {
        return "Memory: ${getBrand()} ${getMemorySize()} ${hashCode()}"
    }

}