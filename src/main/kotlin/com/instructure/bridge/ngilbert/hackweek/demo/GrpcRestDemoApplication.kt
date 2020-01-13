package com.instructure.bridge.ngilbert.hackweek.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcRestDemoApplication

fun main(args: Array<String>) {
    runApplication<GrpcRestDemoApplication>(*args)
}
