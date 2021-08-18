package com.daniel.demo.dagger2.demo_4.computer.cpu

import com.daniel.demo.dagger2.common.Hardware

interface Cpu : Hardware {

    fun getCoreNum(): Int

    fun getFrequency(): String

    override fun info(): String {
        return "Cpu: ${getBrand()} core-num ${getCoreNum()} ${getFrequency()} ${hashCode()}"
    }
}