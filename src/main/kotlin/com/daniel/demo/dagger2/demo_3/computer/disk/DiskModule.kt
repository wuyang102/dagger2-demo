package com.daniel.demo.dagger2.demo_3.computer.disk

import com.daniel.demo.dagger2.common.Hardware
import com.daniel.demo.dagger2.common.HardwareKey
import com.daniel.demo.dagger2.common.HardwareType
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds
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

    @Multibinds
    fun diskSet(): Map<String, Disk>

    @Binds
    @IntoMap
    @HardwareKey(HardwareType.DISK, SeaGateDisk::class)
    fun bindDisk3(disk: SeaGateDisk): Hardware

    @Binds
    @IntoMap
    @HardwareKey(HardwareType.DISK, WestDigitalDisk::class)
    fun bindDisk4(disk: WestDigitalDisk): Hardware
}