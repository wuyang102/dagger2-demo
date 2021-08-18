package com.daniel.demo.dagger2.demo_3.computer.cpu

import javax.inject.Inject

class IntelCpu @Inject constructor() : Cpu {

    override fun getBrand(): String = "intel"

    override fun getCoreNum(): Int = 2

    override fun getFrequency(): String = "2GHz"
}