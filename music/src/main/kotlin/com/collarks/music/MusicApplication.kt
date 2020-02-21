package com.collarks.music

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MusicApplication

fun main(args: Array<String>) {
	runApplication<MusicApplication>(*args)
}
