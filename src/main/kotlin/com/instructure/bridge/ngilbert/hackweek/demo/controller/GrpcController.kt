package com.instructure.bridge.ngilbert.hackweek.demo.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/api")
class GrpcController {

  @GetMapping("/hackweek/grpc")
  fun msg(): String {
    return "I'm alive"
  }

}
