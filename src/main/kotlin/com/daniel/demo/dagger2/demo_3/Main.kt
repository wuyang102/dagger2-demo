package com.daniel.demo.dagger2.demo_3

import com.daniel.demo.dagger2.common.CpuArch
import com.daniel.demo.dagger2.common.HardwareKey
import com.daniel.demo.dagger2.common.HardwareKeyCreator
import com.daniel.demo.dagger2.common.HardwareType
import com.daniel.demo.dagger2.demo_3.computer.DaggerComputerComponent
import com.daniel.demo.dagger2.demo_3.computer.memory.KingstonMemory


fun main(args: Array<String>) {

    val component = DaggerComputerComponent.builder()
        .brand("Lenovo")
        .productModel("XYZ")
        .build()
    val computer1 = component.computer()
    val computer2 = component.computer()
    println(computer1.info())
    println(computer2.info())

    val hardwareMap = component.hardwareMap()
    val info = hardwareMap.toList().fold("") { acc, pair -> acc + pair.second.info() + "\n" }
    println("Hardware map")
    println(info)

    val key = HardwareKeyCreator.createHardwareKey(HardwareType.MEMORY, KingstonMemory::class.java)
    val memory = hardwareMap[key]
    println("Kingston memory")
    println(memory?.info())

    val cpuMap = component.cpuMap()
    val x86Cpu = cpuMap[CpuArch.X86]
    println("X86 cpu")
    println(x86Cpu?.info() + "\n")

}