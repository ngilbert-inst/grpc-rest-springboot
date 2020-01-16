package com.instructure.bridge.ngilbert.hackweek.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter

@SpringBootApplication
class GrpcRestDemoApplication {
  @Bean
  fun protobufHttpMessageConverter(): ProtobufHttpMessageConverter = ProtobufHttpMessageConverter()
}

fun main(args: Array<String>) {
  runApplication<GrpcRestDemoApplication>(*args)
}
