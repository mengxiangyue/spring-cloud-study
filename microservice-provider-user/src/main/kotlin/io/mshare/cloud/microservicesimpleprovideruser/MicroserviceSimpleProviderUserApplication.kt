package io.mshare.cloud.microservicesimpleprovideruser

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class MicroserviceSimpleProviderUserApplication

fun main(args: Array<String>) {
    SpringApplication.run(MicroserviceSimpleProviderUserApplication::class.java, *args)
}
