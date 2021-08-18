package com.daniel.demo.dagger2.demo_2

import com.daniel.demo.dagger2.demo_2.computer.Computer
import com.daniel.demo.dagger2.demo_2.computer.DaggerComputerComponent
import javax.inject.Inject


fun main(args: Array<String>) {

    val component = DaggerComputerComponent.create()
    val programmer = Programmer()
    component.inject(programmer) // manual inject
    val info = programmer.computer.info()
    println(info)
}

class Programmer {

    @Inject
    lateinit var computer: Computer
}