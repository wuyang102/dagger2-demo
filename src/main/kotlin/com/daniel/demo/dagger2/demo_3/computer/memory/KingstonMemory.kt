package com.daniel.demo.dagger2.demo_3.computer.memory

import javax.inject.Inject

class KingstonMemory @Inject constructor() : Memory {

    override fun getBrand(): String = "kingston"

    override fun getMemorySize() = "2G"

}