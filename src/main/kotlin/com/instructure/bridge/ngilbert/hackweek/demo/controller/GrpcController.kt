package com.instructure.bridge.ngilbert.hackweek.demo.controller

import com.instructure.bridge.ngilbert.hackweek.demo.DemoServiceGrpc
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class GrpcController : DemoServiceGrpc.DemoServiceImplBase() {

  @Override
  fun msg(): String {
    return "I'm alive"
  }

}
