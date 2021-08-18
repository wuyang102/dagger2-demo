package com.daniel.demo.dagger2.demo_1.computer.cpu

import com.daniel.demo.dagger2.common.Hardware
import javax.inject.Inject

class Cpu @Inject constructor() : Hardware {

    override fun getBrand(): String = "intel"

    override fun info(): String {
        return "Cpu: ${getBrand()} core-num ${getCoreNum()} ${getFrequency()} ${hashCode()}"
    }

    fun getCoreNum(): Int = 2

    fun getFrequency(): String = "2GHz"
}