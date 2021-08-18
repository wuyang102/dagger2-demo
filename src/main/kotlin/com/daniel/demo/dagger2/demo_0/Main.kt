package com.daniel.demo.dagger2.demo_0

import com.daniel.demo.dagger2.demo_0.computer.Computer

fun main(args: Array<String>) {

    val computer = Computer()
    val info = computer.info()
    println(info)
}