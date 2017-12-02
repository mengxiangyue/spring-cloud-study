package io.mshare.cloud.eureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
@EnableDiscoveryClient
class MicroserviceDiscoveryEurekaApplication

fun main(args: Array<String>) {
    SpringApplication.run(MicroserviceDiscoveryEurekaApplication::class.java, *args)
}
