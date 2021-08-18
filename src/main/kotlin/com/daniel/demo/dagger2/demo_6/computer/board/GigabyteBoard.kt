package com.daniel.demo.dagger2.demo_6.computer.board

import com.daniel.demo.dagger2.common.Hardware
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class GigabyteBoard @AssistedInject constructor(
    @Assisted override val serialNum: String
) : Board {

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

    @AssistedFactory
    interface GigabyteBoardFactory {
        fun create(serialNum: String): GigabyteBoard
    }
}