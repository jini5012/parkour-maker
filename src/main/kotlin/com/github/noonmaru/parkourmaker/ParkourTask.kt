package com.github.noonmaru.parkourmaker

class ParkourTask: Runnable {
    override fun run() {
        ParkourMaker.fakeEntityServer.update()
    }
}