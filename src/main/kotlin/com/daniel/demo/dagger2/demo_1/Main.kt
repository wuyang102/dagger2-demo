package com.daniel.demo.dagger2.demo_1

import com.daniel.demo.dagger2.demo_1.computer.DaggerComputerComponent

fun main(args: Array<String>) {

    val component = DaggerComputerComponent.create()
    val info = component.computer().info()
    println(info)
}