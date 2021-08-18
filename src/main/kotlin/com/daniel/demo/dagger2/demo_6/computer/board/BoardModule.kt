package com.daniel.demo.dagger2.demo_6.computer.board

import com.daniel.demo.dagger2.demo_6.computer.board.GigabyteBoard.GigabyteBoardFactory
import dagger.Module
import dagger.Provides
import kotlin.random.Random

@Module
object BoardModule {

    @Provides
    fun provideBoard(factory: GigabyteBoardFactory): Board {
        return factory.create(Random(System.currentTimeMillis()).nextLong().toString())
    }
}