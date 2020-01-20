package com.instructure.bridge.ngilbert.hackweek.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.protobuf.ProtobufJsonFormatHttpMessageConverter


@Configuration
class ApiConfig {
  @Bean
  fun protobufHttpMessageConverter(): ProtobufJsonFormatHttpMessageConverter {
    return ProtobufJsonFormatHttpMessageConverter()
  }
}