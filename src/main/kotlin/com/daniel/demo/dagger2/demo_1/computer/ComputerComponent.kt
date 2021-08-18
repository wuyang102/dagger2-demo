package com.daniel.demo.dagger2.demo_1.computer

import dagger.Component

@Component
interface ComputerComponent {

    fun computer(): Computer
}