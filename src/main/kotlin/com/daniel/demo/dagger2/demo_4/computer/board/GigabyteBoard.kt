package com.daniel.demo.dagger2.demo_4.computer.board

import com.daniel.demo.dagger2.common.Hardware
import javax.inject.Inject

class GigabyteBoard @Inject constructor() : Board {

    private val mutableHardWares = mutableListOf<Hardware>()

    override val hardWares: List<Hardware>
        get() = mutableHardWares

    override fun mount(hw: Hardware) {
        mutableHardWares.add(hw)
    }

    override fun unmount(hw: Hardware) {
        mutableHardWares.remove(hw)
    }

    override fun getBrand(): String = "Gigabyte"

}