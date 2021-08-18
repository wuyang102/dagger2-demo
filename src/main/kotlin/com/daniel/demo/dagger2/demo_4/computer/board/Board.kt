package com.daniel.demo.dagger2.demo_4.computer.board

import com.daniel.demo.dagger2.common.Hardware

interface Board : Hardware {

    val hardWares: List<Hardware>

    fun mount(hw: Hardware)

    fun unmount(hw: Hardware)

    override fun info(): String {
        val hardWaresInfo = hardWares.fold("") { acc, hardWare -> "$acc${hardWare.info()}\n" }
        return "Board: ${getBrand()} ${hashCode()}\n$hardWaresInfo"
    }
}