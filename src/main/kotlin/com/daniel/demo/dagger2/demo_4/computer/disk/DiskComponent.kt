package com.daniel.demo.dagger2.demo_4.computer.disk

import dagger.Subcomponent

@Subcomponent(modules = [DiskModule::class])
interface DiskComponent {

    fun disks(): Map<String, @JvmSuppressWildcards Disk>

    @Subcomponent.Builder
    interface Builder {

        fun build(): DiskComponent
    }
}