package com.daniel.demo.dagger2.demo_6.computer.board

import com.daniel.demo.dagger2.common.Hardware

interface Board : Hardware {

    val serialNum: String

    val hardWares: List<Hardware>

    fun mount(hw: Hardware)

    fun unmount(hw: Hardware)

    override fun info(): String {
        val hardWaresInfo = hardWares.fold("") { acc, hardWare -> "$acc${hardWare.info()}\n" }
        return "Board: ${getBrand()} serial-num $serialNum ${hashCode()}\n$hardWaresInfo"
    }
}