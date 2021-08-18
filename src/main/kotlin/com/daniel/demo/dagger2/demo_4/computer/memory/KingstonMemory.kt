package com.daniel.demo.dagger2.demo_4.computer.memory

import javax.inject.Inject

class KingstonMemory @Inject constructor() : Memory {

    override fun getBrand(): String = "Kingston"

    override fun getMemorySize() = "2G"

}