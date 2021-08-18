package com.daniel.demo.dagger2.demo_4.computer.disk

import com.daniel.demo.dagger2.common.Hardware

interface Disk : Hardware {

    fun getCapacity(): String

    override fun info(): String {
        return "Disk: ${getBrand()} ${getCapacity()} ${hashCode()}"
    }
}