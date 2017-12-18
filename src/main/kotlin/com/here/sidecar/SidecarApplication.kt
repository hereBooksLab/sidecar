package com.here.sidecar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.sidecar.EnableSidecar

@SpringBootApplication
@EnableSidecar
class SidecarApplication

fun main(args: Array<String>) {
    runApplication<SidecarApplication>(*args)
}
