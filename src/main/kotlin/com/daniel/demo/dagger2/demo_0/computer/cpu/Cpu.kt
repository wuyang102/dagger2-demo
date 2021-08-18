package com.daniel.demo.dagger2.demo_0.computer.cpu

import com.daniel.demo.dagger2.common.Hardware

class Cpu : Hardware {

    override fun getBrand(): String = "intel"

    override fun info(): String {
        return "Cpu: ${getBrand()} core-num ${getCoreNum()} ${getFrequency()} ${hashCode()}"
    }

    fun getCoreNum(): Int = 2

    fun getFrequency(): String = "2GHz"
}