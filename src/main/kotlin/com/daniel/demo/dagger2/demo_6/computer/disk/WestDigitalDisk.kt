package com.daniel.demo.dagger2.demo_6.computer.disk

import javax.inject.Inject

class WestDigitalDisk @Inject constructor(): Disk {

    override fun getBrand(): String = "West Digital"

    override fun getCapacity(): String = "1T"
}