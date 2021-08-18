package com.daniel.demo.dagger2.demo_4.computer.board

import dagger.Binds
import dagger.Module

@Module
interface BoardModule {

    @Binds
    fun bindBoard(board: GigabyteBoard): Board
}