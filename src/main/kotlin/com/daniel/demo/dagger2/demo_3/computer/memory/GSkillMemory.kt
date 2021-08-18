package com.daniel.demo.dagger2.demo_3.computer.memory

import javax.inject.Inject

class GSkillMemory @Inject constructor(): Memory {

    override fun getBrand(): String = "gskill"

    override fun getMemorySize(): String = "4G"
}