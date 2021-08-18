package com.daniel.demo.dagger2.demo_1.computer.memory

import com.daniel.demo.dagger2.common.Hardware
import javax.inject.Inject

class Memory @Inject constructor() : Hardware {

    override fun getBrand(): String = "kingston"

    fun getMemorySize(): String = "2G"

    override fun info(): String {
        return "Memory: ${getBrand()} ${getMemorySize()} ${hashCode()}"
    }
}