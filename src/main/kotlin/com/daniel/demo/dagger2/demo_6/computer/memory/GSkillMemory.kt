package com.daniel.demo.dagger2.demo_6.computer.memory

import javax.inject.Inject

class GSkillMemory @Inject constructor(): Memory {

    override fun getBrand(): String = "GSKill"

    override fun getMemorySize(): String = "4G"
}