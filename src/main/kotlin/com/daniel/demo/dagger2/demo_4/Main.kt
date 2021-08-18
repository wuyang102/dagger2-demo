package com.daniel.demo.dagger2.demo_4

import com.daniel.demo.dagger2.demo_4.computer.DaggerComputerComponent


fun main(args: Array<String>) {

    val computerComponent = DaggerComputerComponent.builder()
        .brand("Lenovo")
        .build()
    val computer = computerComponent.computer()
    println(computer.info())

    val computerComponent2 = DaggerComputerComponent.builder()
        .brand("Dell")
        .build()
    val computer2 = computerComponent2.computer()
    println(computer2.info())

}
