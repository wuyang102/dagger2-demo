package com.daniel.demo.dagger2.demo_6.computer.disk

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface DiskModule {

    @Binds
    @IntoMap
    @StringKey("SeaGate")
    fun bindDisk1(disk: SeaGateDisk): Disk

    @Binds
    @IntoMap
    @StringKey("WestDigital")
    fun bindDisk2(disk: WestDigitalDisk): Disk

}