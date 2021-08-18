package com.daniel.demo.dagger2.demo_6

import com.daniel.demo.dagger2.demo_6.computer.DaggerComputerComponent
import com.daniel.demo.dagger2.demo_6.computer.cpu.DaggerCpuComponent
import com.daniel.demo.dagger2.demo_6.computer.disk.DaggerDiskComponent
import com.daniel.demo.dagger2.demo_6.computer.memory.DaggerMemoryComponent


fun main(args: Array<String>) {

    val cpuComponent = DaggerCpuComponent.create()
    val memoryComponent = DaggerMemoryComponent.create()
    val diskComponent = DaggerDiskComponent.create()

    val computerComponent = DaggerComputerComponent.builder()
        .brand("Lenovo")
        .cpuComponent(cpuComponent)
        .memoryComponent(memoryComponent)
        .diskComponent(diskComponent)
        .build()
    val computer = computerComponent.computer()
    println(computer.info())
}
