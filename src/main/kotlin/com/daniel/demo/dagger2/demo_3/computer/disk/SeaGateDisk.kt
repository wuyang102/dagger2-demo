package com.daniel.demo.dagger2.demo_3.computer.disk

import javax.inject.Inject

class SeaGateDisk @Inject constructor() : Disk {

    override fun getBrand(): String = "SeaGate"

    override fun getCapacity(): String = "2T"
}