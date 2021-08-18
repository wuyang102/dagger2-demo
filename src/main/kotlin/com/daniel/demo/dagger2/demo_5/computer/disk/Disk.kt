package com.daniel.demo.dagger2.demo_5.computer.disk

import com.daniel.demo.dagger2.common.Hardware

interface Disk : Hardware {

    fun getCapacity(): String

    override fun info(): String {
        return "Disk: ${getBrand()} ${getCapacity()} ${hashCode()}"
    }
}