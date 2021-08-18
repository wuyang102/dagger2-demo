package com.daniel.demo.dagger2.demo_5.computer.disk

import dagger.Component


@Component(modules = [DiskModule::class])
interface DiskComponent {

    fun disks(): Map<String, @JvmSuppressWildcards Disk>

}