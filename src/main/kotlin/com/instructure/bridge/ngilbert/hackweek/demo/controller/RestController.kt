package com.instructure.bridge.ngilbert.hackweek.demo.controller

import com.instructure.bridge.ngilbert.hackweek.demo.MsgResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/api")
class RestController {

  @GetMapping("/hackweek")
  fun msg(): String {
    return "I'm alive"
  }

  @GetMapping(value = ["/hackweek/protobuf"], produces = [PROTOBUF_MEDIA_TYPE_VALUE])
  fun protobufMsg(): ResponseEntity<MsgResponse> = ResponseEntity.ok(
    MsgResponse
      .newBuilder()
      .setMessage("Hello, Yes, I'm alive.")
      .build()
  )

  companion object {
    const val PROTOBUF_MEDIA_TYPE_VALUE = "application/x-protobuf"
  }
}
